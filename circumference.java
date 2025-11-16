class circumference {
    double radius;

    double getArea(){
   return 3.14*radius*radius;
    }

    double getCircumference(){
        return 2*3.14*radius;
    }

    void show(){
        System.out.println("area of circle is:"+getArea());
        System.out.println("circumference of the circle is:"+getCircumference());
    }
    public static void main(String[] args){
        circumference s1=new circumference();
        circumference s2=new circumference();

        s1.radius=4.9;

        s2.radius=9;

        s1.show();
        s2.show();
    }
    }

