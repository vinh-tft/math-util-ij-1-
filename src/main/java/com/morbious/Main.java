package com.morbious;

import com.morbious.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg1RunsWell();
        testFactorialGivenRightArgMinus2ThrowException();
    }

    public static void testFactorialGivenRightArg1RunsWell() {
        int n = 1; //cho/given n = 1
        long expectedResult = 1; //hy vọng 1! ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy ? đoán xem
        // so sánh expected và actual
        System.out.println("Expected: " + expectedResult + " Actual:" + actualValue);
        System.out.println("status:" + (expectedResult == actualValue));
    }




    //CODE CÁC TEST CASE ĐỂ TEST HÀM CHẠY ĐÚNG HAY SAI - THỰC HÀNH TDD
    // HÀM NÀY ỨNG VỚI 1 TEST CASE, TEST CASE VỚI N - 0 HÀM TRẢ VỀ NGON
    // TÊN HÀM MANG Ý NGHĨA TEST CASE LUÔN, ĐỂ GIÚP DÂN DEV KIỂM TRA TÍNH THIẾU ĐỦ CÁC TEST CASE -> TRÁNH NGHỊCH LÝ THUỐC TRỪ SÂU
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; //cho/given n = 0
        long expectedResult = 1; //hy vọng 0! ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy ? đoán xem
        // so sánh expected và actual
        System.out.println("Expected: " + expectedResult + " Actual:" + actualValue);
        System.out.println("status:" + (expectedResult == actualValue));
    }

    // test giai thừa với âm 2, hy vọng trả về là : 1 NGOẠI LỆ XUẤT HIỆN
    public static void testFactorialGivenRightArgMinus2ThrowException() {
        MathUtility.getFactorial(-2);
    } // KHI ĐƯA N = 2, THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
      // CODE TA THIẾT KẾ LÀ : NẾU N ÂM THÌ
}