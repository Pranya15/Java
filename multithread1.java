package lec20;
import java.util.*;


class child extends Thread{
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Child: " + i);
            try { Thread.sleep(500); }
            catch (Exception e) {}
        }
    }
}

public class multithread1{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        child t1=new child();
        t1.start();
        //Join method is used to for the first execution of the program like in this case if join is written in upper of top means first the t1
        //will execute man had to wait and if it is written below the for loop it means the main will execute first then the t1 will execute
        for(int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
        try {
            t1.join();

        } catch (Exception e) {
        }

    }
}