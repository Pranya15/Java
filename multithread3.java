package lec20;
import java.util.*;

class bank{
    int b=100;
    synchronized void withdraw(int amnt){
        System.out.print(Thread.currentThread().getName() + " checking balance...");
        if(amnt<=b){
            System.out.println(Thread.currentThread().getName() + " proceeding withdraw...");
            b=b-amnt;
            System.out.println("remaining balance"+b);
        }
        else{
            System.out.println("No money Left");
        }
    }
}
class me extends Thread{
    bank b;
    me(bank b){
        this.b=b;
    }
    public void run(){
        b.withdraw(100);
    }
}

public class multithread3 {
    public static void main(String[]args){
        bank b=new bank();
        me m1=new me(b);
        me m2=new me(b);
        m1.setName("mahi");
        m2.setName("pooja");
        m1.start();
        m2.start();
    }
}
