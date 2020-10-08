package cn.itcast.day08.demo03;

public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        one.room = "101Room";
        System.out.println("name: " + one.getName()
                + ",age: " + one.getAge() + ",room: " + one.room + ",id: " + one.getId());

        Student two = new Student("黄蓉", 16);
        System.out.println("name: " + two.getName()
                + ".age: " + two.getAge() + ",room: " + two.room + ",id: " + two.getId());

    }
}
