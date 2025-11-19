abstract class Animals {
    abstract void sound();
}
class Doggy extends Animals{
    void sound(){
        System.out.println("DOGGY :woof woof");
    }
}
class Catty extends Animals{
    void sound(){
        System.out.println("CATTY :meow meow");
    }
}
class shuu{
    public static void main(String[] args){

        Animals s1= new Doggy();
        Animals s2= new Catty();
        s1.sound();
        s2.sound();
    }
}