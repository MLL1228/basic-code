package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //开机
        computer.powerOn();

//        //准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
//        //首先进行向上转型
//        USB usb = mouse;
        USB usbMouse = new Mouse();
        computer.useDevices(usbMouse);


        //创建一个USB键盘
        Keyboard keyboard = new Keyboard(); //没有使用多态写法
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevices(keyboard); // 正确写法！也发生了向上转型

        //关机
        computer.powerOff();

    }
}
