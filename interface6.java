interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car1 implements Vehicle {
}

class Test {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.start();
    }
}
