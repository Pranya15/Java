public class Laptops {
    String brand;
    int RAM;
    double price;

    Laptops(String b, int r, double p) {
        brand = b;
        RAM = r;
        price = p;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }
}

 class LaptopMain {
    public static void main(String[] args) {
        Laptops l1 = new Laptops("HP", 8, 55000);
        Laptops l2 = new Laptops("Dell", 16, 72000);

        l1.show();
        l2.show();
    }
}
