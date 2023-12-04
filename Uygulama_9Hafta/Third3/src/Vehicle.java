//Vehicle sinifi.
public class Vehicle {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void start(){
        System.out.println("Vehicle has started.");
    }
}
