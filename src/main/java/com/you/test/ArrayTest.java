package com.you.test;

import java.util.Arrays;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/22 15:55
 */
public class ArrayTest {
    public static void main(String[] args) {
        //字符串转换为数组
        String str = "aaa\\bbb\\ccc";
        String[] aa = str.split("\\\\");
        System.out.println(Arrays.toString(aa));
        System.out.println("-----------------");
        for(int i = 0;i < aa.length;i++){
            System.out.println(aa[i]);
        }
        System.out.println("-----------------");
        for(String bb :aa){
            System.out.println(bb);
        }
    }
}
