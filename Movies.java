class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String n, double r, int y) {
        name = n;
        rating = r;
        releaseYear = y;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("---------------------------");
    }
}
class M{
    public static void main(String[] args) {

        Movie m1 = new Movie("Inception", 8.8, 2010);
        Movie m2 = new Movie("Avengers: Endgame", 8.4, 2019);
        Movie m3 = new Movie("Dune", 8.2, 2021);
        Movie m4 = new Movie("Spider-Man: No Way Home", 8.3, 2021);
        Movie m5 = new Movie("Oppenheimer", 8.5, 2023);

        Movie[] movies = {m1, m2, m3, m4, m5};

        System.out.println("Movies released after 2020:");
        System.out.println("--------------------------------");

        for (Movie m : movies) {
            if (m.releaseYear > 2020) {
                m.show();
            }
        }
    }
}

