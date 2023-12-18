//Calculator sinifi.
import java.util.Scanner;
public class Calculator {
    public double divide() throws CustomException{ //CustomException'a hata mesajini firlatan ve iki sayiyi bolme divide metodu.
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        num1 = sc.nextDouble();
        System.out.print("Ikinci sayiyi giriniz: ");
        num2 = sc.nextDouble();
        if (num2 == 0)
            throw new CustomException();

        System.out.print(num1 + "/" + num2 + " = ");
        return num1 / num2;
    }
    public static void main(String[] args) {//Main metodu.
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.divide());
        }catch (CustomException exception){
            System.out.println(exception.getMessage());
            System.out.println("Bolen sifir olmaz!");
        }
    }
}