//Circle sinifi
public class Circle implements Shape{
    private double radius;
    //Set ve get metodlari.
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }//Set ve get metodlarin sonu.
    //getArea metodunu override etmek.
    @Override
    public double getArea() {
        return pi * (radius * radius);
    }
    //getPerimeter metodunu override etmek.
    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
