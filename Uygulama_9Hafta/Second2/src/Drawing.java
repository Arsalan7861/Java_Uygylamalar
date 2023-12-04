//Drawing sinifi.
public class Drawing {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        Triangle triangle = new Triangle();
        triangle.setName("Triangle");
        Square square = new Square();
        square.setName("Square");

        //Nesneleri bir diziye atmak.
        Shape[] shapes = {circle, triangle, square};

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ":");
            shape.draw();
            System.out.println();
        }
    }
}
