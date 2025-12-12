package lec19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class program {

    static void writero(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt"); // override
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void writer(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt", true); // append
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void deleted() {
        File file = new File("New.txt");
        try {
            if (file.delete()) {
                System.out.println("File deleted");
            } else {
                System.out.println("File NOT deleted");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void reader() {
        try {
            FileReader reader = new FileReader("New.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What you want to do");
        System.out.println("1. Create a new file");
        System.out.println("2. Write something (Override)");
        System.out.println("3. Write something (Append)");
        System.out.println("4. Delete the file");
        System.out.println("5. Read your file");
        System.out.println("Enter your choice:");
        int n = sc.nextInt();
        sc.nextLine();  // FIX: to clear newline

        switch (n) {

            case 1:
                File file = new File("New.txt");
                try {
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getCanonicalPath());
                    } else {
                        System.out.println("File already exists: " + file.getCanonicalPath());
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

            case 2:
                System.out.println("Enter data to write (Override):");
                String data1 = sc.nextLine();   // FIX: sc.nextLine()
                writero(data1);
                break;

            case 3:
                System.out.println("Enter data to write (Append):");
                String data2 = sc.nextLine();   // FIX: sc.nextLine()
                writer(data2);
                break;

            case 4:
                deleted();
                break;

            case 5:
                reader();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
