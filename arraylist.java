import java.util.ArrayList;
class Mn{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1,30);
        list.remove(2);
        list.remove(Integer.valueOf(20));

        System.out.println(list);
        System.out.println(list.get(1));
    }
}