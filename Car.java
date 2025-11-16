 class Car {
    String Brand;
    String model;
    String prize;
    void show(){
        System.out.println("the brand of the car is:"+Brand);
        System.out.println("the model of the car is:"+model);
        System.out.println("the prize of the car is:"+prize);
    }
    public static void main(String[] args){
        Car c1= new Car();
        Car c2= new Car();
        Car c3= new Car();

        c1.Brand="Maruti";
        c1.model="Swift";
        c1.prize="5.79 lakh";

        c2.Brand="Suzuki";
        c2.model="Baleno";
        c2.prize="9.10 lakh";

        c3.Brand="Hyundai";
        c3.model="Verna";
        c3.prize="10.69 lakh";

        c1.show();
        c2.show();
        c3.show();
    }
}
