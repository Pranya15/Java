package lec19;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filesystem {
    static void writer(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt",true);
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void reader(){
        try{
            FileReader reader=new FileReader("New.txt");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    static void deleted(){
        File file=new File("New.txt");
        try{
            if(file.delete()){
                System.out.println("file deletted");
            }
            else{
                System.out.println("file not deleted");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void deletedata(){
        try {
            FileWriter deletedata = new FileWriter("New.txt",true);
//            deletedata.write();
            deletedata.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[]args){
//            writer(" i dont want to talk to you ");
//            reader();
//            deleted();
        File file=new File("New.txt");
        try{
            if(file.createNewFile()){
                System.out.println("file created"+file.getPath()+file.getCanonicalPath());
            }
            else{
                System.out.println("file already exits"+file.getPath()+ file.getAbsolutePath()+file.getCanonicalPath());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        deletedata();
    }
}