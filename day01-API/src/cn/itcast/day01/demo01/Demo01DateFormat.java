package cn.itcast.day01.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
    }

    public static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(text);
        System.out.println(date);
    }

    public static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String text = "2020-10-01 07:10:00";
        Date date = sdf.parse(text);

        System.out.println(date);
    }
}
