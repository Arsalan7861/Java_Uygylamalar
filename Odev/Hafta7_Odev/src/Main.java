import java.util.Arrays;//Dizi nesnesini olusturmak icin Array paket'i eklemek.

public class Main {
    public static void main(String[] args) {
        Hesap hesap1 = new Hesap();
        Hesap hesap2 = new Hesap();

        hesap1.setAd("Arsalan");
        hesap1.setHesapNo("234324");
        hesap1.setBakiye(345.7);
        hesap1.hesapSayaci();
        hesap1.yatirma(400);//Hesaba int olarak para yatirmak.
        System.out.println(Hesap.sayac + ". Hesabin bilgileri:");
        bilgiYaz(hesap1.getAd(), hesap1.getHesapNo(), hesap1.getBakiye());
        System.out.println("--> Arsalan hesabindan " + (int)hesap1.cekme(300) + "TL cekildi.");//Hesaptan int olarak para cekmek.
        System.out.println("--> Arsalan'in hesabindan para cektikten sonraki bakiye: " + hesap1.getBakiye());

        hesap2.setAd("Amir");
        hesap2.setHesapNo("234234");
        hesap2.setBakiye(340.45);
        hesap2.hesapSayaci();
        hesap2.yatirma(100.10);//Hesaba double olarak para yatirmak.
        System.out.println("\n" + Hesap.sayac + ". Hesabin bilgileri:");
        bilgiYaz(hesap2.getAd(), hesap2.getHesapNo(), hesap2.getBakiye());
        System.out.println("--> Amir hesabindan " + hesap2.cekme(100.1) + "Tl cekildi.");//Hesaptan double olarak para cekmek.
        System.out.println("--> Amir'in hesabindan para cektikten sonraki bakiye: " + hesap2.getBakiye());

        String[] hesapNumaralar = new String[2];//Hesap numaralarini saklamak icin dizi olusturmak.
        //hesapNumaralar dizisine Hesap numaralari atamak.
        hesapNumaralar[0] = hesap1.getHesapNo();
        hesapNumaralar[1] = hesap2.getHesapNo();
        System.out.println("\n--> Hesap Numaralari : " + Arrays.toString(hesapNumaralar));//Hesap numaralar yazdirmak.
        System.out.println("\n--> Olusturulan toplam hesap = " + Hesap.sayac);//Olusturulan toplam hesaplari ekrana yazdirmak.


    }

    //Hesaplarin bilgilerini yazdirma metodu.
    public static void bilgiYaz(String ad, String hesapNo, double bakiye){
        System.out.println("Ad : " + ad);
        System.out.println("Hesap No : " + hesapNo);
        System.out.println("Bakiye : " + bakiye);
    }
}