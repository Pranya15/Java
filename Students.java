import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
    String name;
    int Rollno;
    public Students(int Rollno, String name){
        this.name=name;
        this.Rollno=Rollno;
    }
    public String toString(){
        return Rollno+ " "+ name;
    }
}
class Student3 implements Comparator<Students>{
    public int compare(Students s1,Students s2){
        return s1.name.compareTo(s2.name);
    }
}
class ello{
    public static void main(String[] args){
        ArrayList<Students> list= new ArrayList<>();
        list.add(new Students(1,"huih"));
        list.add(new Students(2,"sjh" ));
        Collections.sort(list,new Student3());
        for(Students s:list){
            System.out.println(s.Rollno+" "+s.name);
        }
    }
}