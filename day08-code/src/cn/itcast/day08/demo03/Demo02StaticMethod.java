package cn.itcast.day08.demo03;

//一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。

public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass(); //首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic(); //正确，不推荐。这种写法在编译之后也会被javac翻译成"类名称.静态方法名"
        MyClass.methodStatic(); //正确，推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法");
    }
}
