class construct {
    int a;
    String name;
    construct(int a, String name){
        this.a=a;
        this.name=name;
        System.out.println("name"+" "+name);
        System.out.println("a"+" "+a);
    }
}
class main{
    public static void main(String[] args){
        construct s1=new construct(10,"patel");

        construct s2=new construct(20,"singh");
    }

}
