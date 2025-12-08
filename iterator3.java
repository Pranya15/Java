import java.util.ArrayList;
import java.util.ListIterator;

public class iterator3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer x=it.next();
            if(x==5){
                it.set(10);
            }

            System.out.println(x);
        }
        while (it.hasPrevious()) {
            Integer y = it.previous();
            System.out.println(y);
        }
    }
}

