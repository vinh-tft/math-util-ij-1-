package com.morbious.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //chuẩn bị mảng 2 chiều chứa data đưa vào test hàm getFactorial() của mình
    // hàm này phải là static - nằm ở một chỗ cố định trong ram để cung cấp data cho các hàm test

    public static Object[][] initData() {
        return new Object[][] {
                {(Object)0, (Object) 1},
                {(Object)1, (Object) 1},
                {(Object)2, (Object) 2},
                {(Object)3, (Object) 6},
                {(Object)4, (Object) 24},
                {(Object)5, (Object) 120},
                {(Object)6, (Object) 720}
        };
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell(int n, long expectedResult) {

        assertEquals(expectedResult, MathUtility.getFactorial(n));
    }

}