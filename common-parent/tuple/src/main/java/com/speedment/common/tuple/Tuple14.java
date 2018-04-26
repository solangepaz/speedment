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
import com.speedment.common.tuple.getter.TupleGetter1;
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
 * This {@link Tuple } has a degree of 14
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
 * 
 * @author Per Minborg
 */
public interface Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> extends Tuple {
    
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
    
    @Override
    default int degree() {
        return 14;
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
            default : throw new IllegalArgumentException(String.format("Index %d is outside bounds of tuple of degree %s", index, degree()
            ));
        }
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter0<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T0> getter0() {
        return Tuple14::get0;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter1<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T1> getter1() {
        return Tuple14::get1;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter2<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T2> getter2() {
        return Tuple14::get2;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter3<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T3> getter3() {
        return Tuple14::get3;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter4<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T4> getter4() {
        return Tuple14::get4;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter5<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T5> getter5() {
        return Tuple14::get5;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter6<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T6> getter6() {
        return Tuple14::get6;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter7<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T7> getter7() {
        return Tuple14::get7;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter8<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T8> getter8() {
        return Tuple14::get8;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter9<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T9> getter9() {
        return Tuple14::get9;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter10<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T10> getter10() {
        return Tuple14::get10;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 11st element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter11<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T11> getter11() {
        return Tuple14::get11;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 12nd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter12<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T12> getter12() {
        return Tuple14::get12;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 13rd element in the {@code
     * Tuple}.
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> TupleGetter13<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, T13> getter13() {
        return Tuple14::get13;
    }
}