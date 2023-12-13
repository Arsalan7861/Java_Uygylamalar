//Square sinifi.
public class Square implements Shape{
    private double side;
    //Set ve get metodlari.
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }//Set ve get metodlarin sonu.
    //getArea metodunu override etmek.
    @Override
    public double getArea() {
        return side * side;
    }
    //getPerimeter metodunu override etmek.
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
