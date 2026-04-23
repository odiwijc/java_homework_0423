package com.nuist.homework;

// 11、演示继承及其特性
public class TestChildClass extends TestClass implements ShowInterface {
    private int cno;

    public TestChildClass() {
        super();
    }

    // 17、演示super的用法
    public TestChildClass(int id, String name, int cno) {
        super(id, name);
        this.cno = cno;

    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    @Override
    public void show() {
        System.out.printf("id = %d; name = %s; tno = %d\n", super.getId(), super.getName(), cno);
    }
}
