//Girilen 10 sayının ortalamasını hesaplayan uygulama.
import java.util.Scanner;

public class Uygulama_4_2 {
    public static void main(String[] args){
        int sayi = 0;
        int toplam = 0;
        float ortalama = 0;
        int a ;

        Scanner scan = new Scanner(System.in);

        for (a = 1 ;a <= 10; a++){
            System.out.print(a + ".Sayiyi giriniz:");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        ortalama = (float) toplam/(a-1);
        System.out.println("Girilen sayilarin ortalamasi: " + ortalama);
    }
}
