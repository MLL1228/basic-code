package cn.itcast.day04.demo02;

public class Demo02MethodDefine {

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int number = sum(10, 20);
        System.out.println("变量的值：" + number);
    }
}
