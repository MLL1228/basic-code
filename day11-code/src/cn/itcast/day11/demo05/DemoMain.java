package cn.itcast.day11.demo05;

public class DemoMain {

    public static void main(String[] args) {
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();

        //匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();
    }
}
