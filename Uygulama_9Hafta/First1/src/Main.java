//Main sinifi.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal's sound:");
        animal.makesound();

        Animal bird = new Bird();
        System.out.println("Bird's sound:");
        bird.makesound();
    }
}