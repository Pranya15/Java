package lec20;
// Background task (Download simulation)
class mythread extends Thread{
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("dwonloading" + i*20+"%");
            try { Thread.sleep(500); }   //This sleep method is to delay the execution
            catch (Exception e) {}
        }
    }
}
public class multithread2 {
    public static void main(String[]args){
        mythread m1=new mythread();
        m1.start();
        for(int i=0;i<=5;i++){
            System.out.println("timer"+i+"sec");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}