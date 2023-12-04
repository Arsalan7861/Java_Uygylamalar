//Main sinifi
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Toyota");
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("M8");

        Vehicle[] vehicles = {vehicle, car};

        for (Vehicle vehicle1 : vehicles){
            System.out.println(vehicle1.getBrand() + ":");
            vehicle1.start();
            System.out.println();
        }
    }
}