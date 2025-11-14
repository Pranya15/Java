class Animal {
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("bread");
    }
}
class l{
    public static void main(String[] args){
        Animal s1=new Dog();
        s1.eat();
    }
}