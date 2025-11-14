public class overload {
    void add(int a) {
        System.out.println(a);
    }

    void add(int a, int b) {
        System.out.println(a + b);

    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        overload o = new overload();
        o.add(1);
        o.add(1,2);
        o.add(1,2,3);
    }
}