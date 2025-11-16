class Novel {
    String title;
    String author;
    double price;

    Novel(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void applyDiscount() {
        price = price - (price * 0.10);
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Final Price after 10% discount: " + price);
        System.out.println("-----------------------------");
    }
}

class n {
    public static void main(String[] args) {
        Novel n1 = new Novel("Pride and Prejudice", "Jane Austen", 400);
        Novel n2 = new Novel("The Alchemist", "Paulo Coelho", 550);

        n1.applyDiscount();
        n2.applyDiscount();

        n1.show();
        n2.show();
    }
}

