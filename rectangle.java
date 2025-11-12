 public class rectangle {
    int length;
    int width;
    int area;
    int perimeter;
    void show(){
        System.out.println("length="+length);
        System.out.println("width="+width);
        area = length*width;
        perimeter = (length+width)*2;
        System.out.println("area="+area);
        System.out.println("perimeter="+perimeter);
    }
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.length=10;
        r1.width=20;


        r1.show();
    }
}
