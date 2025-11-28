import java.util.HashSet;

public class duplicatehashset {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 2};
        HashSet<Integer> set = new HashSet();
        for (int x : arr) {
            set.add(x);
            System.out.println(set);
        }
        if(arr.length==set.size()){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
