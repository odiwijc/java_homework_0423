package com.nuist.homework;

public class Test20 {
    public static void main(String[] args) {
        // 20、演示String和StringBuffer StringBuilder的区别
        // String可变 后面两个不可变
        // 字符串拼接上的性能区别：
        // String << StringBuffer < StringBuilder

        // 21、演示String的常用方法15个
        // 1. concat
        String a = "123";
        String b = "345";
        System.out.println(a.concat(b));

        // 2.getBytes
        String s = "何意味";
        byte[] bs = s.getBytes(); // 一个汉字对应三个字节
        for (byte i : bs) {
            System.out.print(i + "\t");
        }

        // 3. charAt
        String s1 = "ni gan ma";
        System.out.println(s1.charAt(2));

        // 4.codePointAt()
        // 获取指定位置的字符的字符集编码
        String s2 = "ni 干 ma";
        System.out.println(s2.codePointAt(0));
        System.out.println((char) s2.codePointAt(0));

        // 5.equalsIgnoreCase() 忽略大小写
        String s3 = "AbC";
        String s4 = "aBc";
        System.out.println(s3.equalsIgnoreCase(s4));

        // 6. startsWith
        String s5 = "a123";
        System.out.println(s5.startsWith("a1"));

        // 7 8 9 10
        String s6 = "    hjm    ";
        System.out.println(s6.trim());
        System.out.println(s6.strip());
        System.out.println(s6.stripTrailing());
        System.out.println(s6.stripLeading());

        // 11 12
        String s7 = "asdwdadsad";
        System.out.println(s7.indexOf("a"));
        System.out.println(s7.lastIndexOf("a"));

        // 13 14 15
        // replace() / replaceALL() / replaceFirst()
        String str = "hjm like study, hjm like jvav";
        System.out.println(str.replace('h','g'));
        System.out.println(str.replaceAll("hjm","manbo"));
        System.out.println(str.replaceFirst("hjm","manbo"));


    }
}
