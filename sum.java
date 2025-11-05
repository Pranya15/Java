import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int i=1;
        int sum=0;

        while(i<=n){
            sum=sum+i;
            i=i+1;
        }
        System.out.println(sum);
        }
    }