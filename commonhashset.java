import java.util.HashMap;
import java.util.HashSet;

class commonhashset {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) {
            set.add(x);
        }
        System.out.println(set);
        HashSet<Integer> result=new HashSet<>();
        for(int y:arr2){
            if(set.contains(y)){
                result.add(y);
            }
        }
     System.out.println(result);
    }
}