package cn.itcast.day05.demo;

public class HelloMain {

    public static void main(String[] args) {
        HelloJava helloJava = new HelloJava("test", 18);

        String res = helloJava.test1();
        System.out.println(res);
    }
}
