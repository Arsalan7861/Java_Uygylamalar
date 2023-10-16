//Kullanicinin yazdigi maili dogru olup olmadigini kontrol etme kontrolu.
import java.util.Scanner;
public class Uygulama_1 {
    public static void main(String[] args) {
        String email;

        Scanner sc = new Scanner(System.in);
        System.out.print("Mailinizi giriniz:");
        email = sc.nextLine();

        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Islem  basarili.");
        } else {
            System.out.println("Yanlis email.");
        }
    }
}
