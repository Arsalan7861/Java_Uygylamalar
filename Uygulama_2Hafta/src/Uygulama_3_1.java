// -1 değeri girene kadar sıcaklığın toplamını, ortalamasını ve toplam gün sayısını hesaplayan uygulama.
import java.util.*;
public class Uygulama_3_1 {
    public static void main(String[] args) {

        int sicaklik = 0;
        int toplam_sicaklik = 0;
        int adet = 0;
        float ortalama_sicaklik = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sicakligi girin:");
            sicaklik = scan.nextInt();
            toplam_sicaklik += sicaklik;
            adet ++;
        }while(sicaklik != -1);

        toplam_sicaklik += 1;
        adet -= 1;

        ortalama_sicaklik = (float) toplam_sicaklik/adet;
        System.out.println("Verilen gunlerin sicaklik ortalamsi: " + ortalama_sicaklik);
        System.out.println("Toplam gun sayisi: " + adet);
        System.out.println("Verilen toplam sicaklik: " + toplam_sicaklik);
    }
}