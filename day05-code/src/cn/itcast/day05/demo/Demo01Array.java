package cn.itcast.day05.demo;

public class Demo01Array {

    public static void main(String[] args) {

        // 动态初始化数组
        int[] arrayA = new int[300];
        /* 动态初始化数组分两步
        * int[] arrayA;
        * arrayA = new int[100];
        * */
        double[] arrayB = new double[300];
        String[] arrayC = new String[5];

        // 静态初始化数组
        int[] arrayA1 = new int[] { 10, 20, 30 };
        // 静态初始化数组省略格式
        /*int[] arrayA1 = { 10, 20, 30 };*/

    }
}
