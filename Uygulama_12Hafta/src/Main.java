public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("Pitbull", "Wild");
        System.out.println("Type: " + pitbull.name);
        pitbull.makeVoice();
        pitbull.move();
    }
}
