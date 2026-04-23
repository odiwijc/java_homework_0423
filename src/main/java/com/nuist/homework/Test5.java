package com.nuist.homework;

public class Test5 {
    // 5、创建一个类,定义一些属性,定义一个show方法, 在show方法,通过调用show方法显式属性的值
    public static void main(String[] args) {
        TestClass test = new TestClass(67, "SixSeven");
        test.show();
        TestClass test1 = new TestClass();
        test1.show();

        // 8、创建一个类,定义一些属性, 在另一个类中使用set/get方法调用属性
        System.out.println(test.getId());
        test.setId(89);
        System.out.println(test.getId());

        // 10、创建一个类,定义一个求和的方法,并调用
        int[] arr = {1, 2, 3};
        System.out.println(test.sum(arr));

        // 11、演示继承及其特性
        // 子类继承父类后自动获取父类所定义的所有变量和方法，并通过定义自己特有的特性代表对父类的功能拓展
        TestChildClass child = new TestChildClass();
        child.show();

        // 13、演示方法重写并调用
        System.out.println(test.sum(6, 7));

        // 14、演示运行时多态
        System.out.println("展示运行时多态：");
        TestClass test3 = new TestClass();
        TestChildClass test4 = new TestChildClass();
        test3.show();
        test4.show();

        // 15&16、演示接口和抽象类的区别
        //两者都无法实例化
        //两者都可以定义抽象方法
        //抽象类中可以定义非抽象方法、成员变量和构造方法；
        //接口中只能定义抽象方法和常量（jdk1.8后可以定义静态方法、默认方法）
        //抽象类和子类之间是 is A 的关系，有较高的耦合度；
        //而接口和实现类是 like A 的关系，满足、符合规范
        //类只能单继承；接口可以多实现

        // 17、演示super的用法
        TestChildClass child1 = new TestChildClass(233, "hjm", 123);
        child1.show();

        // 18、演示instanceof的用法
        String a = "1";
        System.out.println(a instanceof String);

        // 19、演示运行时异常和检查异常
        try {
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("运行时异常");
        }


    }


}
