package com.you.test;

/**
 * @author youwei
 * @version 1.0
 * @date 2021/9/22 15:01
 */
public class Box<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t ;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("测试类"));
        System.out.printf("整形值为：%d\n\n",integerBox.get());
        System.out.printf("字符串为：%s\n",stringBox.get());
    }
}
