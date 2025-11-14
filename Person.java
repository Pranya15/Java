 class Person {
    void displayname(){
        System.out.println("Pranya");
    }
}

class Student extends Person{
    void displayclass(){
        System.out.println("12th");
    }
}

class Monitor extends Student{
    void checkdiscipline(){
        System.out.println(" monitor is checking the discipline");
    }
}

class p{
    public static void main(String[] args){
        Monitor mon=new Monitor();
        mon.displayclass();
        mon.checkdiscipline();
        mon.displayclass();
    }
}