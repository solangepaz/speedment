/**
 * 
 * Copyright (c) 2006-2018, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.nullable;

import com.speedment.common.tuple.Tuple7;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.getter.TupleGetter0;
import com.speedment.common.tuple.getter.TupleGetter1;
import com.speedment.common.tuple.getter.TupleGetter2;
import com.speedment.common.tuple.getter.TupleGetter3;
import com.speedment.common.tuple.getter.TupleGetter4;
import com.speedment.common.tuple.getter.TupleGetter5;
import com.speedment.common.tuple.getter.TupleGetter6;
import com.speedment.common.tuple.getter.TupleGetter;
import java.util.Optional;

/**
 * This interface defines a generic Tuple of degree 7 that can hold non-null
 * values. A Tuple is type safe, immutable and thread safe. For Tuples that can
 * hold
 * null elements see {@link TupleOfNullables}
 * 
 * This {@link Tuple } has a degree of 7
 * 
 * @param <T0> type of element 0
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 * @param <T4> type of element 4
 * @param <T5> type of element 5
 * @param <T6> type of element 6
 * 
 * @author Per Minborg
 */
public interface Tuple7OfNullables<T0, T1, T2, T3, T4, T5, T6> extends TupleOfNullables {
    
    Optional<T0> get0();
    
    Optional<T1> get1();
    
    Optional<T2> get2();
    
    Optional<T3> get3();
    
    Optional<T4> get4();
    
    Optional<T5> get5();
    
    Optional<T6> get6();
    
    @Override
    default int degree() {
        return 7;
    }
    
    @SuppressWarnings("unchecked")
    default Optional<Object> get(int index) {
        switch (index) {
            case 0 : return (Optional<Object>)get0();
            case 1 : return (Optional<Object>)get1();
            case 2 : return (Optional<Object>)get2();
            case 3 : return (Optional<Object>)get3();
            case 4 : return (Optional<Object>)get4();
            case 5 : return (Optional<Object>)get5();
            case 6 : return (Optional<Object>)get6();
            default : throw new IllegalArgumentException(String.format("Index %d is outside bounds of tuple of degree %s", index, degree()
            ));
        }
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter0<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T0> getter0() {
        return Tuple7::get0;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter1<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T1> getter1() {
        return Tuple7::get1;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter2<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T2> getter2() {
        return Tuple7::get2;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter3<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T3> getter3() {
        return Tuple7::get3;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter4<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T4> getter4() {
        return Tuple7::get4;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter5<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T5> getter5() {
        return Tuple7::get5;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6> TupleGetter6<Tuple7<T0, T1, T2, T3, T4, T5, T6>, T6> getter6() {
        return Tuple7::get6;
    }
}