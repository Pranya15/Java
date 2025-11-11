public class variable {
    static int a=5;
    int data=20; //instant

    public static void main(String[] args){
        int a=5;
        variable obj=new variable();
        int b=10; //local
        System.out.println(a);
      System.out.println(obj.data);
      System.out.println(b);
    }
}
