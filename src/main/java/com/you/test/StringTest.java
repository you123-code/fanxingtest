package com.you.test;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/23 9:44
 */
public class StringTest {
    public static void main(String[] args) {
       /* List<Integer> nums = Lists.newArrayList(1,null,2,null,5);
        //long cou = nums.stream().filter(num -> num != null).count();
        long cou = nums.stream().filter(a -> a != null).count();
        System.out.println(cou);*/
        List<Integer> nums = Lists.newArrayList(1,null,2,2,null,3,null,4,null,5,null,7,8);
        List<String>  str = Lists.newArrayList("aaa","bbbbbb","ccc");
        List<Integer> numm = nums.stream().filter(num -> num != null).collect(Collectors.toList());
        Long con = nums.stream().filter(num -> num != null).count();
        List<Integer> nummm = nums.stream().filter(num -> num != null).distinct().collect(Collectors.toList());
        IntStream list = nums.stream().filter(num -> num != null).distinct().mapToInt(num -> num * 2);
        list.forEach(System.out::println);
        str.stream().mapToInt(strr -> strr.length()).forEach(System.out::println);
        System.out.println("过滤之后的list集合 = "+ numm);
        System.out.println("过滤之后的list元素个数 = "+ con);
        System.out.println("去重后的list集合 = "+nummm);
        System.out.println(nums.stream().filter(num -> num != null).distinct().mapToInt(a -> a * 2).peek(System.out::println).skip(2).limit(4).sum());
    }
}
