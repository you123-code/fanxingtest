package com.you.test;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/14 20:47
 */
public class GenericMethodTest {
    //泛型方法
    public static <E> void pringArray(E[] inputArray){
        //输出数组元素
        for(E ele : inputArray){
            System.out.printf("%s",ele);
        }
        System.out.println();
    }
    //创建不同类型的数组
    public static void main(String[] args) {
        //创建不同类型数组
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,1.3,1.4};
        Character[] charArrays = {'h','m','g'};
        System.out.println("整数数组元素为：");
        pringArray(intArray);
        System.out.println("\n双精度数组元素为：");
        pringArray(doubleArray);
        System.out.println("\n字符型数组元素为：");
        pringArray(charArrays);
    }
}
