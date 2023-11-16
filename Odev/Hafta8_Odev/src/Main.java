//8. Haftanin Odevi Main sinifi.
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Kitap[] kitaplar = kitaplar();//Metod aracaligiyla kitap dizisini baslatmak.

        //Kitap sinifindaki bilgiYazdir metodu ile kitaplari ekrana yazdirmak.
        System.out.println("1. Kitap : ");
        kitaplar[0].bilgiYazdir();
        System.out.println("2. Kitap : ");
        kitaplar[1].bilgiYazdir();
        System.out.println("3. Kitap : ");
        kitaplar[2].bilgiYazdir();
        //Belirli bir yilin ustundeki kitaplari ekrana yazdirmak.
        int istenenYil = 1996;
        System.out.println(istenenYil + " Yilin ustundeki kitaplar:");
        yilustu(kitaplar, istenenYil);
        //Belirli bir yazarin kitaplarini ekrana yazdirmak.
        String istenenYazar;
        istenenYazar = "Robert Kiyosaki";
        System.out.println(istenenYazar + "'in kitaplari: ");
        belirliYazar(kitaplar, istenenYazar.toLowerCase());

    }

    //Kitaplari dizi olarak donduren metod.
    public static Kitap[] kitaplar(){
        Kitap[] kitaplar = new Kitap[3];
        kitaplar[0] = new Kitap("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        kitaplar[1] = new Kitap("The Eternal Challenge", "Abu Zakariya", 2017);
        kitaplar[2] = new Kitap("The alchemist", "Paulo Coelho", 1988);
        return kitaplar;
    }

    //Belirli bir yilin ustundeki kitaplari ekrana yazdiran metodu.
    public static void yilustu(Kitap[] kitaplar, int yil){
        for (int i = 0; i < kitaplar.length; i++){
            Kitap kitap = kitaplar[i];
            if (kitap.getYayinYili() > yil){
                System.out.println("--> " + kitap);
            }
        }
    }

    //Belirli bir yazarin kitaplarini ekrana yazdirma metodu.
    public static void belirliYazar(Kitap[] kitaplar, String yazar){
        for (int i = 0; i < kitaplar.length; i++){
            Kitap kitap = kitaplar[i];
            if (Objects.equals(kitap.getYazar(), yazar.toLowerCase())){
                System.out.println("--> " + kitap);
            }
        }
    }
}