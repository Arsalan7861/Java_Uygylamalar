//Uygulama 1 ve 2.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ogrenci notlari sinfindan nesneler olusturmak.
        OgrenciNotlari ogrenci1 = new OgrenciNotlari();
        System.out.println("1. Ogrencinin notlari giriniz:");
        ogrenci1.notlar();//Ogrencinin notlarini kullanicidan alip ekrana yazdirma metodunu cagirma.
        ogrenci1.ort();//Girilen ogrencinin notlarinin ortalamasini hesaplayip ekrana yazdirma metodunu cagirma.
        OgrenciNotlari ogrenci2 = new OgrenciNotlari();
        System.out.println("2. Ogrencinin notlari giriniz:");
        ogrenci2.notlar();//Ogrencinin notlarini kullanicidan alip ekrana yazdirma metodunu cagirma.
        ogrenci2.ort();//Girilen ogrencinin notlarinin ortalamasini hesaplayip ekrana yazdirma metodunu cagirma.
        OgrenciNotlari ogrenci3 = new OgrenciNotlari();
        System.out.println("3. Ogrencinin notlari giriniz:");
        ogrenci3.notlar();//Ogrencinin notlarini kullanicidan alip ekrana yazdirma metodunu cagirma.
        ogrenci3.ort();//Girilen ogrencinin notlarinin ortalamasini hesaplayip ekrana yazdirma metodunu cagirma.
        OgrenciNotlari ogrenci4 = new OgrenciNotlari();
        System.out.println("4. Ogrencinin notlari giriniz:");
        ogrenci4.notlar();//Ogrencinin notlarini kullanicidan alip ekrana yazdirma metodunu cagirma.
        ogrenci4.ort();//Girilen ogrencinin notlarinin ortalamasini hesaplayip ekrana yazdirma metodunu cagirma.
        OgrenciNotlari ogrenci5 = new OgrenciNotlari();
        System.out.println("5. Ogrencinin notlari giriniz:");
        ogrenci5.notlar();//Ogrencinin notlarini kullanicidan alip ekrana yazdirma metodunu cagirma.
        ogrenci5.ort();//Girilen ogrencinin notlarinin ortalamasini hesaplayip ekrana yazdirma metodunu cagirma.

        float[] tumNotlar = new float[15];//Tum notlari saklmak icin olusturulan dizi.
        for (int i = 0; i < 3; i++){//Ogrencilerin notlarini bir diziye ata.
            tumNotlar[i] = ogrenci1.notlar[i];
            tumNotlar[i + 3] = ogrenci2.notlar[i];
            tumNotlar[i + 6] = ogrenci3.notlar[i];
            tumNotlar[i + 9] = ogrenci4.notlar[i];
            tumNotlar[i + 12] = ogrenci5.notlar[i];
        }
        System.out.println("Tum notlar : " + Arrays.toString(tumNotlar));//Tum notlari ekrana yazdirmak.

        tumNotOrt(tumNotlar);//Tum notlarin ortalamasini hesaplayan metod.

        //Notlarin yuksek olanini bulmak.
        float enBuyuk = tumNotlar[0];
        for (int i = 0; i < tumNotlar.length; i++){
                if (enBuyuk < tumNotlar[i]){
                    enBuyuk = tumNotlar[i];
            }
        }
        System.out.println("Notlarin en yuksegi = " + enBuyuk);

        //Notlariin dusuk olani bulmak.
        float enKucuk = tumNotlar[0];
        for (int i = 0; i < tumNotlar.length; i++) {
            if (enKucuk > tumNotlar[i]) {
                enKucuk = tumNotlar[i];
            }
        }
        System.out.println("Notlarin en dusugu = " + enKucuk);

        float[] yuksekDusuk = new float[15];//Degerleri yuksekten kucuge siralamasi icin dizi olusturmak.
        yuksekDusuk = tumNotlar;//tumNotlarin degerlerini yuksekdusuk dizisine atamak.
        float gecici;
        for (int i = 0; i < yuksekDusuk.length - 1;  i++){//Buyukten kucuge siralamak.
            for (int j = 0; j < yuksekDusuk.length - i - 1; j++){
                if (yuksekDusuk[j] > yuksekDusuk[j + 1]){
                    gecici = yuksekDusuk[j];
                    yuksekDusuk[j] = yuksekDusuk[j + 1];
                    yuksekDusuk[j + 1] = gecici;
                }
            }
        }
        System.out.println("Notlarin Buyukten kucuge sirlanmasi = " + Arrays.toString(yuksekDusuk));

        float[] dusukYuksek = new float[15];//Degerleri kucukten yuksege siralamasi icin dizi olusturmak.
        dusukYuksek = tumNotlar;//tumNotlar dizisinden degerlerini dusukYuksek dizisine atamak.
        float gecici1;
        for (int i = 0; i < dusukYuksek.length;  i++){//Kucukten buyuge siralamak.
            for (int j = i; j < dusukYuksek.length; j++){
                if (dusukYuksek[i] < dusukYuksek[j]){
                    gecici1 = dusukYuksek[i];
                    dusukYuksek[i] = dusukYuksek[j];
                    dusukYuksek[j] = gecici1;
                }
            }
        }
        System.out.println("Notlarin kucukten buyuge siralanmasi = " + Arrays.toString(dusukYuksek));


    }

    //Tum notlarinin ortalamasini hesaplayan metod.
    public static void tumNotOrt(float[] tumNot){
        float toplam = 0;
        int sayac = 0;
        float ortalama;
        for (int i = 0; i < 15; i++){
            toplam += tumNot[i];
            sayac++;
        }
        ortalama = toplam/sayac;
        System.out.println("Tum notlarin ortalamasi = " + ortalama);
    }
}