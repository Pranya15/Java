import java.util.ArrayList;
import java.util.Collections;
//sort
class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
