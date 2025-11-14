public class Shape  {
    void draw(){
        System.out.println("Drawing the shape");
    }
}
class Circle extends Shape{
    void calculateArea(){
        System.out.println("area of circle r*r");
    }
}
class r{
    public static void main(String[] args){
        Circle c =new Circle();
        c.draw();
        c.calculateArea();
    }
}

