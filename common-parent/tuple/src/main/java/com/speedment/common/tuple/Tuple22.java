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
package com.speedment.common.tuple;

import com.speedment.common.tuple.getter.TupleGetter0;
import com.speedment.common.tuple.getter.TupleGetter10;
import com.speedment.common.tuple.getter.TupleGetter11;
import com.speedment.common.tuple.getter.TupleGetter12;
import com.speedment.common.tuple.getter.TupleGetter13;
import com.speedment.common.tuple.getter.TupleGetter14;
import com.speedment.common.tuple.getter.TupleGetter15;
import com.speedment.common.tuple.getter.TupleGetter16;
import com.speedment.common.tuple.getter.TupleGetter17;
import com.speedment.common.tuple.getter.TupleGetter18;
import com.speedment.common.tuple.getter.TupleGetter19;
import com.speedment.common.tuple.getter.TupleGetter1;
import com.speedment.common.tuple.getter.TupleGetter20;
import com.speedment.common.tuple.getter.TupleGetter21;
import com.speedment.common.tuple.getter.TupleGetter2;
import com.speedment.common.tuple.getter.TupleGetter3;
import com.speedment.common.tuple.getter.TupleGetter4;
import com.speedment.common.tuple.getter.TupleGetter5;
import com.speedment.common.tuple.getter.TupleGetter6;
import com.speedment.common.tuple.getter.TupleGetter7;
import com.speedment.common.tuple.getter.TupleGetter8;
import com.speedment.common.tuple.getter.TupleGetter9;
import com.speedment.common.tuple.getter.TupleGetter;

/**
 * This interface defines a generic Tuple of any order that can hold null
 * values. A Tuple is type safe, immutable and thread safe. For pure non-null
 * value elements see {@link Tuple}
 * This {@link Tuple } has a degree of 22
 * 
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * @param <T11> type of element 11
 * @param <T12> type of element 12
 * @param <T13> type of element 13
 * @param <T14> type of element 14
 * @param <T15> type of element 15
 * @param <T16> type of element 16
 * @param <T17> type of element 17
 * @param <T18> type of element 18
 * @param <T19> type of element 19
 * @param <T20> type of element 20
 * @param <T21> type of element 21
 * 
 * @author Per Minborg
 */
public interface Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> extends Tuple {
    
    T0 get0();
    
    T1 get1();
    
    T2 get2();
    
    T3 get3();
    
    T4 get4();
    
    T5 get5();
    
    T6 get6();
    
    T7 get7();
    
    T8 get8();
    
    T9 get9();
    
    T10 get10();
    
    T11 get11();
    
    T12 get12();
    
    T13 get13();
    
    T14 get14();
    
    T15 get15();
    
    T16 get16();
    
    T17 get17();
    
    T18 get18();
    
    T19 get19();
    
    T20 get20();
    
    T21 get21();
    
    @Override
    default int degree() {
        return 22;
    }
    
    default Object get(int index) {
        switch (index) {
            case 0 : return get0();
            case 1 : return get1();
            case 2 : return get2();
            case 3 : return get3();
            case 4 : return get4();
            case 5 : return get5();
            case 6 : return get6();
            case 7 : return get7();
            case 8 : return get8();
            case 9 : return get9();
            case 10 : return get10();
            case 11 : return get11();
            case 12 : return get12();
            case 13 : return get13();
            case 14 : return get14();
            case 15 : return get15();
            case 16 : return get16();
            case 17 : return get17();
            case 18 : return get18();
            case 19 : return get19();
            case 20 : return get20();
            case 21 : return get21();
            default : throw new IllegalArgumentException(String.format("Index %d is outside bounds of tuple of degree %s", index, degree()
            ));
        }
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter0<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T0> getter0() {
        return Tuple22::get0;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter1<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T1> getter1() {
        return Tuple22::get1;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter2<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T2> getter2() {
        return Tuple22::get2;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter3<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T3> getter3() {
        return Tuple22::get3;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter4<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T4> getter4() {
        return Tuple22::get4;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter5<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T5> getter5() {
        return Tuple22::get5;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter6<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T6> getter6() {
        return Tuple22::get6;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter7<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T7> getter7() {
        return Tuple22::get7;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter8<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T8> getter8() {
        return Tuple22::get8;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter9<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T9> getter9() {
        return Tuple22::get9;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter10<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T10> getter10() {
        return Tuple22::get10;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 11st element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter11<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T11> getter11() {
        return Tuple22::get11;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 12nd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter12<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T12> getter12() {
        return Tuple22::get12;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 13rd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter13<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T13> getter13() {
        return Tuple22::get13;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 14th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter14<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T14> getter14() {
        return Tuple22::get14;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 15th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter15<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T15> getter15() {
        return Tuple22::get15;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 16th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter16<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T16> getter16() {
        return Tuple22::get16;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 17th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter17<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T17> getter17() {
        return Tuple22::get17;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 18th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter18<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T18> getter18() {
        return Tuple22::get18;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 19th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter19<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T19> getter19() {
        return Tuple22::get19;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 20th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter20<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T20> getter20() {
        return Tuple22::get20;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 21st element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter21<Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, T21> getter21() {
        return Tuple22::get21;
    }
}