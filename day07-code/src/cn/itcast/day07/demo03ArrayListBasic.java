package cn.itcast.day07;

import java.util.ArrayList;

public class demo03ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);

        int num = list.get(1);
        System.out.println(num);
    }
}
