import java.util.HashMap;
// for sum print index values of the nos
class hashmap3 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[]={2,7,11,15};
        int target=9;

        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+ " "+i);
                break;
            }
            map.put(arr[i], i);
        }
    }
}