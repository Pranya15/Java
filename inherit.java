public class inherit {
    class Animal {
        void eat() {
            System.out.println("aanda");

        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("bhow bhow");
        }
    }
    class puppy extends Dog {
        void sleeps() {
            System.out.println("snor");
        }
    }

    public static void main(String[] args) {
        inherit obj = new inherit();
        puppy p1 =obj.new puppy();

        p1.eat();
        p1.bark();
        p1.sleeps();
}

}

