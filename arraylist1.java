package lect18;
import java.util.Scanner;
public class arraylist1 {
    public static void main(String[]args){
        try{

            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value of a");
            int a=sc.nextInt();
            System.out.println("enter the value of b");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hyy");
        try{
            int a[]={1,2,3,4,5};
            System.out.println(a[7]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("byee:)");
    }
}