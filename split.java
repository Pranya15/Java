class split{
    public static void main(String[] args){
        String str="java cpp c php js";
        String a[]=str.split("") ;
        for(String val : a){
            System.out.println(a[0]);
        }
    }
}