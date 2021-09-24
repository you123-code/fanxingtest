package com.you.test;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/15 8:37
 */
public class MaximumTest {
    //比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;//假设为最大值
        if(y.compareTo(x) > 0){
            max = y;//y最大
        }
        if(z.compareTo(x) > 0){
            max = z;//z最大
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%d,%d,%d,中最大的数为%d\n\n",3,4,5,maximum(3,4,5));
        System.out.printf("%.if,%.if,%.if,中最大的数为%.if",3.3,4.4,5.5,maximum(3.3,4.4,5.5));
        System.out.printf("%s,%s,%s,中最大的数为%s","pear","apple","orange",maximum("pear","apple","orange"));
    }
}

