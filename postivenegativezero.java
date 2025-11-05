import java.util.Scanner;
public class postivenegativezero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of integer");
        int a= sc.nextInt();
        if(a>0){
            System.out.println("postive num");
        } else if (a<0) {
            System.out.println("negative num");
        }
        else {
            System.out.println("zero");
        }

    }
}