abstract class absshape {
    abstract void area();
}

class Circles extends Shape {
    double radius;

    Circles(double radius) {
        this.radius = radius;
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

class Rectangles extends Shape {
    double length;
    double breadth;

    Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }
}

class Calculate {
    public static void main(String[] args) {
        Circles c = new Circles(5);
        Rectangles r = new Rectangles(4, 6); 

        c.area();
        r.area();
    }
}
