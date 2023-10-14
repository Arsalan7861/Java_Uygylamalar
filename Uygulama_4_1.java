//0'a kadar geri sayan sayaç.
import java.util.Scanner;

public class Uygulama_4_1 {
    public static void main(String[] args){
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayiyi giriniz:");
        sayi = scan.nextInt();

        for (int a = sayi; 0 < a ; a--){
            System.out.println(a);
        }
    }
}
