//Main sinifi.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();//Circle nesnesi olusturmak.
        circle.setRadius(3);//Dairenin yaricapi.
        System.out.println("Area of a circle (Radius = " + circle.getRadius() + ") : ");
        System.out.println(circle.getArea());//Dairenin alani.
        System.out.println("Perimeter of a circle (Radius = " + circle.getRadius() + ") : ");
        System.out.println(circle.getPerimeter());//Dairenin cevresi.

        Square square = new Square();//Karenin nesnesi olusturmak.
        square.setSide(4.6);//Karenin kenari.
        System.out.println("Area of a Square (Side = " + square.getSide() + "): ");
        System.out.println(square.getArea());//Karenin alani.
        System.out.println("Perimeter of a square (Side = " + square.getSide() + "): ");
        System.out.println(square.getPerimeter());//Karenin cevresi.

    }
}