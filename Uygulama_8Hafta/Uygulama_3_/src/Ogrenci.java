//Uygulama 3 Ogrenci sinifi
import java.util.Arrays;

public class Ogrenci {
    private String ad;
    private String soyad;
    private double[] not = new double[3];

    public Ogrenci(String ad, String soyad, double[] not) {
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
    }

    public void bilgiYazdir(){
        System.out.println("Ad : " + this.ad);
        System.out.println("Soyad : " + this.soyad);
        System.out.println("Not : " + Arrays.toString(not));
    }
}
