import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
    String name;
    int Rollno;
    public Student1(int Rollno, String name){
        this.name=name;
        this.Rollno=Rollno;
    }
    public int compareTo(Student1 s1){
        return this.Rollno- s1.Rollno;
    }
    public String toString(){
        return Rollno+ " "+ name;
    }
}
class sort {
    public static void main(String[] args){
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1(1,"pranya"));
        list.add(new Student1(2,"evii"));
        Collections.sort(list);
        System.out.println(list);
    }
}
