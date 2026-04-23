package com.nuist.homework;

public class Test4 {
    public static void main(String[] args) {
        // 4、使用2种方式遍历数组并输出到控制台
        int[] arr1 = {1,2,3};
        // 第一种
        for(int i : arr1){
            System.out.print(i+"\t");
        }

        System.out.println();

        // 第二种
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
}
