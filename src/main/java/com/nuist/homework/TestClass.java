package com.nuist.homework;

public class TestClass implements ShowInterface {
    private int id;
    private String name;

    public TestClass(){
        // 7、创建一个类,定义一些属性,使用构造函数重载进行属性初始化
        this(0,"未知");
    }

    // 6、演示构造函数重载
    public TestClass(int id, String name){
        // 9、演示this关键字的用法
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    // 5、创建一个类,定义一些属性,定义一个show方法, 在show方法,通过调用show方法显式属性的值
    // 13、演示方法重写并调用
    public void show(){
        System.out.printf("id = %d; name = %s\n",id,name);
    }

    // 10、创建一个类,定义一个求和的方法,并调用
    public int sum(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
    // 13、演示方法重写并调用
    public int sum(int a, int b){
        return a + b;
    }
}
