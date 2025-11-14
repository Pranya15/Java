class val {
    void calculateArea(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle" + result);
    }

    void calculateArea(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
    void calculateArea(int base, int height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

}class Data{
        public static void main(String[] args) {

            val o = new val();

            o.calculateArea(5.0);
            o.calculateArea(4.0, 6.0);
            o.calculateArea(10, 8);
        }
    }
