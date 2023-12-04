//Circle sinifi.
public class Circle extends Shape {
    @Override
    public void draw() {
            for (int i=-3;i<=3;i++) {
                for (int j = -3; j <= 3; j++) {
                    if ((i * i + j * j) <= (3 * 3)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}


