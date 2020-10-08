package cn.itcast.day05.demo;

public class HelloJava {

    private String name;
    private int age;

    public HelloJava() {
    }

    public HelloJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String test1() {
        System.out.println("test1调用人：" + this);
        return test2();
    }

    private String test2() {
        System.out.println("test2调用人：" + this);
        return this.name;
    }

}
