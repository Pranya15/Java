class equal{
    public static void main(String[] args){
        String str="hello";
        String str1="hello";
        System.out.println(str.equals(str1));

        String str2=new String("hello");
        String str3=new String("hello");

        System.out.println(str2.equals(str3));

    }
}