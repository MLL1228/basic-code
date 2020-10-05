package cn.itcast.day04.demo02;

public class Demo02MethodParam {
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World! " + i);
        }
    }

    public static void main(String[] args) {
        method1(10, 2);
        System.out.println("*****************");
        method2();
    }
}
