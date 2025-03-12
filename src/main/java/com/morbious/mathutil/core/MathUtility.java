package com.morbious.mathutil.core;

public class MathUtility {
    // class này là b thư viện chứa các hàm tính toán học giống class Math trong JDK

    // thư viện chưa hàm tính toán mà ko cần lưu trữ kết quả, chỉ trả về kết quả, th nên được thiết kế là hàm static, ví dụ Math.sqrt()
    // Math.abs()
    // class này tạm làm hàm tính giai thừa n!

    //n! = 1.2.3.4 ... n
    //0! = 1
    // 20! vừa đủ kiểu long, 21! kiểu long chứa ko nổi, tràn
    // quy ước hàm này chỉ tính n từ 0 ... 20
    //code hàm th cx đồng thời phải kiểm thử hàm, muốn kiểm thử phải có test case !!!!



    public static long getFactorial (int n) {
        if (n < 0 || n > 20) {
            //return -1;
            throw new IllegalArgumentException("Invalid n , n between 0 and 20");
        }
        if (n == 0) {
            return 1; //early return, thoát sớm nếu có thể
        }
        // khỏi viết else cho code đẹp
        // n bắt đầu từ 1 ...
        //thuật toán con heo đất, nhân dồn cộng dồn
       if(n == 0){
           return 1;
       }

       return n * getFactorial(n-1);
    }

    //> TEST CASE #1
    //> VERIFY GETFACTORIAL() WITH N = 0
    //> STEP/PROCEDURE
    //          (1) GIVEN N WITH 0
    //          (2) CALL GETFACTORIAL(N)


    //> EXPECTED VALUE/RESULT: THE METHOD WILL RETURN 1


    //> TEST CASE #2
    //> VERIFY GETFACTORIAL() WITH N = 1
    //> STEP/PROCEDURE
    //          (1) GIVEN N WITH 1
    //          (2) CALL GETFACTORIAL(N)


    //> EXPECTED VALUE/RESULT: THE METHOD WILL RETURN 1


    //> TEST CASE #3
    //> VERIFY GETFACTORIAL() WITH N = 5
    //> STEP/PROCEDURE
    //          (1) GIVEN N WITH 5
    //          (2) CALL GETFACTORIAL(N)


    //> EXPECTED VALUE/RESULT: THE METHOD WILL RETURN 120

    //CÒN NHỀU TEST CASE NỮA !!!

}
