package com.you.test;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/22 16:19
 */
public class ArrayTest1 {
    public static void main(String[] args){
        List<Integer> nums1 = Lists.newArrayList(1,null,3,null);
        int[][] magicSquare = {{1,2,3},{5,10,11,8},{9,6,7,3},{12,15,16}};
        for(int i = 0;i < magicSquare.length;i++){
            for(int j = 0;j < magicSquare[i].length;j++){
                System.out.printf(magicSquare[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------------");
        for(int[] cc : magicSquare){
            for(int b : cc){
                System.out.println(b+" ");
            }
        }
        System.out.println("-----------------------------");
        for(int i = 0;i < magicSquare.length;i++){
            System.out.println(Arrays.toString(magicSquare[i]));
        }
    }
}
