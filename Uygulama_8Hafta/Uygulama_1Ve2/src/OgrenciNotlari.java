//Uygulama 1 ve 2 Ogrenci sinifi.
import java.util.Arrays;
import java.util.Scanner;

public class OgrenciNotlari {
    float[] notlar = new float[3];

    //Notlari kullanicidan alip ekrana yazdirma metodu.
    public void notlar() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". notu giriniz: ");
            notlar[i] = scan.nextInt();
        }
        System.out.println("Notlar = " + Arrays.toString(notlar));
    }

    //Ogrenci notlarinin ortalamasini hesaplamak.
    public void ort() {
        float toplam = 0;
        float ortalama;
        int sayac = 0;
        for (int i = 0; i < 3; i++) {
            toplam += notlar[i];
            sayac++;
        }
        ortalama = toplam / sayac;
        System.out.println("Notlarin ortalamasi = " + ortalama);
    }
}

