//Girilen sayinin tam bolenlerini, bolenlerin toplami ve ortalamasini hesaplama uygulamasi.
import java.util.Scanner;

public class Uygulama_4 {
    public static void main(String[] args) {
        int sayi;
        int toplam_bolen = 0;
        float bolen_ortalamasi;
        int sayac = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        sayi = sc.nextInt();

        for (int i = 1 ; i <= sayi; i++){
            if(sayi % i == 0){
                System.out.println(sayi + " sayisi " + i + " sayisina tam bolunur.");
            }else {
                continue;
            }
            sayac++;
            toplam_bolen +=i;
        }

        bolen_ortalamasi = (float)toplam_bolen/sayac;
        System.out.println("Bolenlerin Toplami: " + toplam_bolen);
        System.out.println("Bolenlerin Sayisi: " + sayac);
        System.out.println("Bolenlerin ortalamasi: " + bolen_ortalamasi);
    }
}
