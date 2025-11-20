interface shape1{
    void area();
}
class cirlce1 implements shape1{
    @Override
    public void area() {
        double area;
        double radius=5;
        area = 22/7*radius*radius;
        System.out.println("Area of circle"+area);
    }
    public static void main(String[] args){
        cirlce1 c=new cirlce1();
        c.area();
    }
}
