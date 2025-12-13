package lec21;
import java.util.*;

public class StringAPI {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // Filter numbers greater than 5
        List<Integer> greaterThanFive =
                list.stream().filter(n -> n > 5).toList();

        // Filter odd numbers from the above result
        List<Integer> oddNumbers =
                greaterThanFive.stream().filter(n -> n % 2 == 1).toList();

        // Sum of odd numbers
        int sum =
                oddNumbers.stream().reduce(0, (a, b) -> a + b);

        // Skip first 2 elements
        List<Integer> skipped =
                list.stream().skip(2).toList();

        // Limit first 8 elements
        List<Integer> limited =
                list.stream().limit(8).toList();

        // Sort the list
        List<Integer> sorted =
                list.stream().sorted().toList();

        System.out.println("Sorted: " + sorted);
        System.out.println("Limited: " + limited);
        System.out.println("Skipped: " + skipped);
        System.out.println("Odd numbers > 5: " + oddNumbers);
        System.out.println("Sum: " + sum);
    }
}
