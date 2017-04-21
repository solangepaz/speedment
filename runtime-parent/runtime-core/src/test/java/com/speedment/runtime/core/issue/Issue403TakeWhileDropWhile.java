package com.speedment.runtime.core.issue;

import com.speedment.runtime.core.component.sql.SqlStreamOptimizerComponent;
import com.speedment.runtime.core.component.sql.SqlStreamOptimizerInfo;
import com.speedment.runtime.core.component.sql.override.SqlStreamTerminatorComponent;
import com.speedment.runtime.core.db.AsynchronousQueryResult;
import com.speedment.runtime.core.db.ConnectionUrlGenerator;
import com.speedment.runtime.core.db.DbmsMetadataHandler;
import com.speedment.runtime.core.db.DbmsOperationHandler;
import com.speedment.runtime.core.db.DbmsType;
import com.speedment.runtime.core.db.FieldPredicateView;
import com.speedment.runtime.core.internal.component.sql.SqlStreamOptimizerComponentImpl;
import com.speedment.runtime.core.internal.component.sql.override.SqlStreamTerminatorComponentImpl;
import com.speedment.runtime.core.internal.db.AbstractDbmsType;
import com.speedment.runtime.core.internal.db.AsynchronousQueryResultImpl;
import com.speedment.runtime.core.internal.manager.sql.SqlStreamTerminator;
import com.speedment.runtime.core.internal.stream.builder.ReferenceStreamBuilder;
import com.speedment.runtime.core.internal.stream.builder.pipeline.PipelineImpl;
import com.speedment.runtime.core.stream.parallel.ParallelStrategy;
import com.speedment.runtime.field.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Per Minborg
 */
public class Issue403TakeWhileDropWhile {

    private static final String[] ELEMENTS = {"a", "b", "c", "d", "e", "a"};
    private static final Predicate<String> GREATER_THAN_B = (String s) -> "b".compareTo(s) < 0;
    private static final Predicate<String> LESS_THAN_C = (String s) -> "c".compareTo(s) > 0;

    private Stream<String> stream;

    @Test
    public void ensureStream() {
        assertArrayEquals(ELEMENTS, stream.toArray(String[]::new));
    }

    @Test
    public void checkPredicateGreaterThanB() {
        assertEquals(
            Arrays.asList("c", "d", "e"),
            stream.filter(GREATER_THAN_B).collect(toList())
        );
    }

    @Test
    public void checkPredicateLessThanC() {
        assertEquals(
            Arrays.asList("a", "b", "a"),
            stream.filter(LESS_THAN_C).collect(toList())
        );
    }

    @Test
    public void testTakeWhile() {
        try {
            final Method method = Stream.class.getMethod("takeWhile", Predicate.class);
            log("We are running under Java 9: takeWhile exists");
            @SuppressWarnings("unchecked")
            final Stream<String> newStream = (Stream<String>) method.invoke(stream, LESS_THAN_C);
            final List<String> expected = Arrays.asList("a", "b");
            log("expected:" + expected);
            final List<String> actual = newStream.collect(toList());
            log("actual:" + actual);
            assertEquals(expected, actual);
        } catch (NoSuchMethodException | SecurityException e) {
            log("We run under Java 8: takeWhile does not exist");
            // We are under Java 8. Just ignore. 
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            // We are on Java 9 but it failed
            fail(e.getMessage());
        }

    }

    @Before
    public void before() {
        final PipelineImpl<String> pipeline = new PipelineImpl<>(() -> Stream.of(ELEMENTS));

        DbmsType dbmsType = new AbstractDbmsType() {
            @Override
            public String getName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getDriverManagerName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getDefaultPort() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getDbmsNameMeaning() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getDriverName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public DbmsMetadataHandler getMetadataHandler() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public DbmsOperationHandler getOperationHandler() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ConnectionUrlGenerator getConnectionUrlGenerator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public FieldPredicateView getFieldPredicateView() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        final SqlStreamOptimizerInfo<String> info
            = SqlStreamOptimizerInfo.of(
                dbmsType,
                "select name from name_table",
                "select count(*) from name_table",
                (s, l) -> 1l,
                (Field<String> f) -> "name",
                (Field<String> f) -> String.class
            );

        final AsynchronousQueryResult<String> asynchronousQueryResult = new AsynchronousQueryResultImpl<>(
            "select name from name_table",
            new ArrayList<>(),
            rs -> "z",
            () -> null,
            ParallelStrategy.computeIntensityDefault(),
            ps -> {
            },
            rs -> {
            }
        );
        final SqlStreamOptimizerComponent sqlStreamOptimizerComponent = new SqlStreamOptimizerComponentImpl();
        final SqlStreamTerminatorComponent sqlStreamTerminatorComponent = new SqlStreamTerminatorComponentImpl();

        SqlStreamTerminator<String> streamTerminator = new SqlStreamTerminator<>(
            info,
            asynchronousQueryResult,
            sqlStreamOptimizerComponent,
            sqlStreamTerminatorComponent,
            true
        );

        stream = new ReferenceStreamBuilder<String>(
            pipeline,
            streamTerminator
        );

    }

    private void log(String msg) {
        System.out.println("******** " + msg);
    }

}
