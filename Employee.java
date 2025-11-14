 class Employee {
    void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    void attendingMeeting(){
        System.out.println("Manager is attending the metting");
    }
}
class j{
    public static void main(String[] args){
        Manager m =new Manager();
        m.work();
        m.attendingMeeting();
    }
}
