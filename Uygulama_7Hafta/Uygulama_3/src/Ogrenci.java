import java.util.Arrays;
public class Ogrenci {
    private String ad;
    private String soyad;
    private int[] notlar;
    //Constructor
    public Ogrenci(String ad, String soyad, int[] notlar){
        this.ad = ad;
        this.soyad = soyad;
        this.notlar = notlar;
    }
    //Ogrencinin bilgilerini yazdirmak.
    public void yazdir(){
        System.out.println("Ogrencinin bilgiler : ");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("Notlar : " + Arrays.toString(notlar));
    }
    //Ogrencinin notlarinin ortalamasini hesaplamak.
    public double ortHesapla(){
        double ort;
        ort = (notlar[0] + notlar[1] + notlar[2]) / 3.0;
        return ort;
    }
}
