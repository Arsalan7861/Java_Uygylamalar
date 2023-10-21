//Girilen iki sayılar arasında en büyüğünü ekrana yazdıran uygulama.
import java.util.*;
public class Uygulama_1 {
    public static void main(String[] args) {
        int sayi1, sayi2; //Sayılar
        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayiyi girin:");
        sayi1 = scan.nextInt();
        System.out.print("ikinci sayiyi girin:");
        sayi2 = scan.nextInt();
        if (sayi1 > sayi2){
            System.out.print("Buyuk sayi: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.print("Buyuk sayi: " + sayi2);
        }
    }
}