package com.you.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/22 15:11
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();
        name.add("youwei");
        age.add(22);
        number.add(223);
        number.add(223);

        /*getData(name);
        getData(age);
        getData(number);*/
        //getUperNumber(name);
        getUperNumber(age);
        getUperNumber(number);
    }
    public  static void getData(List<?> data ){
        System.out.println("data:"+data.get(0));
    }
    public static void getUperNumber(List<? extends Number> data){
        System.out.println("data:"+ data.get(0));
    }
}
