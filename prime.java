import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("prime no.");
        }
        else{
            System.out.println("not a prime no.");
        }
        }
    }