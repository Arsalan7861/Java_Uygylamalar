//Car sinifi.
public class Car extends Vehicle{
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void start() {
        System.out.println("The car has turned on.");
    }
}
