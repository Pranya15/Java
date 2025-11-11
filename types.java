public class types {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("HelloWorld");
        str.replace(1,4,"JAVA");
        System.out.println("replace():" +str);
        str.delete(2,6);
        System.out.println("delete():"+str);
        str.deleteCharAt(1);
        System.out.println("deleteCharAt():"+str);
        str.reverse();
        System.out.println("reverse():"+str);
        str.length();
        System.out.println("length():"+str.length());
        str.capacity();
     System.out.println("capacity():"+str.capacity());

    }
}
