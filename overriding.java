public class overriding {
    void eat(){
        System.out.println("FRIES");
    }
    void data(){
        System.out.println("I LOVE EATING");
    }
}
class elephant extends overriding{
    void eat(){
        System.out.println("ELEPHANT IS SOOOOOOOOOOOOO CUTIEEE");
    }
}

class E{
    public static void main(String[] args) {
        overriding o1= new overriding();
        o1.eat();
        o1.data();

        elephant e = new elephant();
        e.eat();
    }
}