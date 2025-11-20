interface animal2{
    void makeSound();
}
class doggie implements animal2 {
    public void makeSound() {
        System.out.println("bark");
    }

    public static void main(String[] args) {
        doggie d = new doggie();
        d.makeSound();
    }
}