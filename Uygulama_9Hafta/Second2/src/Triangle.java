//Triangle sinifi.
public class Triangle extends Shape{
    @Override
    public void draw() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
