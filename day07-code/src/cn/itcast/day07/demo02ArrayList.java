package cn.itcast.day07;

import java.util.ArrayList;

public class demo02ArrayList {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合名称是list，里面装的全部是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        list.add("小李");
        list.add("小张");
        list.add("小王");
        System.out.println(list);
    }
}
