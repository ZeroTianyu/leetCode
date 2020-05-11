package com.marmot.everyday;

/**
 * @Description: 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 * <p>
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 * <p>
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 * @Author: 18465
 * @Create: 2020-05-11 16:19
 */
public class Demo20200511 {
    public static void main(String[] args) {
        Demo20200511 demo20200511 = new Demo20200511();

        double v = demo20200511.myPow(1.00000, 2147483647);


        System.out.println(v);
    }

    /**
     * 不考虑耗时版本
     *
     * @param x
     * @param n
     * @return
     */
//    public double myPow(double x, int n) {
//        if (n == 0) {
//            return 1.0;
//        } else if (n > 0) {
//
//            double v = x;
//            for (int i = 0; i < n - 1; i++) {
//                v = x * v;
//            }
//
//
//            return v;
//        } else {
//
//            double v = x;
//            for (int i = 0; i < n * -1 - 1; i++) {
//                v = x * v;
//            }
//
//
//            return 1 / v;
//
//        }
//
//    }


    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

}
