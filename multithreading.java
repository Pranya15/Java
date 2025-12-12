package lec20;
import java.util.*;
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}

