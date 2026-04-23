package com.nuist.homework;

public class Test3 {
    public static void main(String[] args) {
        // 3、演示数组的动态初始化和静态初始化、并演示它的特性
        // 动态初始化
        // 在声明数组时，不提供具体元素，而是提供数组的长度
        int[] arr = new int[5];
        arr[0] = 6;
        arr[4] = 7;
        for(int i : arr){
            System.out.print(i+"\t");
        }

        System.out.println();

        // 静态初始化
        // 在声明数组时不提供数组的长度，而是提供数组的具体元素
        int[] arr1 = {1,2,3};
        for(int i : arr1){
            System.out.print(i+"\t");
        }
    }
}
