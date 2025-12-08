import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer x = it.next();
            System.out.println(x);
        }
        while (it.hasPrevious()) {
            Integer y = it.previous();
            System.out.println(y);
        }
    }
}
