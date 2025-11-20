interface G{
    void display();
}
interface H{
    void display();
}
class demo implements G,H{
    public void display() {
        System.out.println("show");
    }
    public static void main(String[] args){
        demo obj = new demo();
        obj.display();
    }
}

