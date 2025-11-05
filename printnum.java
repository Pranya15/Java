import java.util.Scanner;

public class printnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
