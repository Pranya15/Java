class Rectangle {

    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
}

 class a {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7.5, 3.2);


        System.out.println("Rectangle 1 Area: " + r1.area());
        System.out.println("Rectangle 1 Perimeter: " + r1.perimeter());

        System.out.println("Rectangle 2 Area: " + r2.area());
        System.out.println("Rectangle 2 Perimeter: " + r2.perimeter());
    }
}


