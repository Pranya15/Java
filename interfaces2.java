interface Walkable{
    void walk();
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable{
        public void walk(){
            System.out.println("Walk");
        }

    @Override
    public void run() {
        System.out.println("Run");
    }
    public static void main(String[] args){
            Human h = new Human();
            h.run();
            h.walk();
    }
}
