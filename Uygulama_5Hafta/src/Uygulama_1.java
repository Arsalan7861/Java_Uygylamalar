import java.util.Scanner;

public class Uygulama_1 {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        String ifade1, ifade2;

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("-->En buyuk sayiyi bulmak...");
        System.out.print("Uc sayi giriniz: ");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        sayi3 = input.nextInt();
        enBuyukSayi(sayi1, sayi2, sayi3);

        System.out.println("-->Sayilarin ortalamasini hesaplamak...");
        System.out.print("Uc sayi giriniz: ");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        sayi3 = input.nextInt();
        ortalama(sayi1, sayi2, sayi3);

        System.out.println("-->Ifadenin ortasini bulmak...");
        System.out.print("Bir ifade yaziniz: ");
        ifade1 = sc.nextLine();
        System.out.println("Ifadenin ortasi: " + ortadakiKarakter(ifade1));

        System.out.println("-->Kelime sayisi hesaplama...");
        System.out.print("Ifade giriniz: ");
        ifade2 = sc.nextLine();
        System.out.println("Ifadeki kelimelerin sayisi: " + kelimeSayisi(ifade2));

        System.out.println("-->Girilen sayinin rakamlarin toplami...");
        System.out.print("En fazla 3 basamakli bir sayi giriniz lutfen:");
        int sayi = input.nextInt();
        rakamToplami(sayi);

        System.out.println("-->Ikinci deger diger iki degerin ortlamasina esit olup olmadigin hesaplamak...");
        System.out.print("Uc sayi giriniz: ");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        sayi3 = input.nextInt();
        System.out.println(deger(sayi1, sayi2, sayi3));



    }

    //En buyuk degeri hesaplayan metod.
    static int enBuyukSayi(int sayi1, int sayi2, int sayi3) {
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En buyuk sayi: " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En buyuk sayi: " + sayi2);
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            System.out.println("En buyuk sayi: " + sayi3);
        }
        return 0;
    }

    //Uc sayinin ortalamasini hesaplayan metod
    static void ortalama(int sayi1, int sayi2, int sayi3){
        float ortalama;
        ortalama = (float)(sayi1 + sayi2 + sayi3)/3;
        System.out.println("Uc sayinin ortalamasi: " + ortalama);
    }

    //Kullanicinin girecegi string bir ifadenin ortasindaki karakteri yazdiracak metod.
    static String ortadakiKarakter(String ifade){
        int orta = ifade.length()/2;
        int uzunluk = ifade.length();
        String ortakarakter;
        String ciftIse = null;
        if (uzunluk % 2 != 0) {
            ortakarakter = String.valueOf(ifade.charAt(orta));
            return ortakarakter;
        }else{
            ortakarakter = String.valueOf(ifade.charAt(orta));
            ciftIse = String.valueOf(ifade.charAt(orta - 1));
            return ciftIse + ortakarakter;
        }
    }

    //Kullanicinin girecegi bir metin icerisindeki kelima sayisini hesaplama metod.
    static int kelimeSayisi(String ifade){
        int kelimeSayisi = 1;
        for (int i = 0; i < ifade.length(); i++){
            if (ifade.charAt(i) == ' '){
                kelimeSayisi++;
            }
        }
        return kelimeSayisi;
    }

    //Kullanicini girecegi en fazla 3 basamakli olan sayinin rakamlari toplamini hesaplama metodu.
    static void rakamToplami(int sayi){
        int toplam = 0;
        int kalan;
        for (int i = 0; i < 3; i++){
            kalan = sayi % 10;
            sayi /= 10;
            toplam += kalan;
        }
        System.out.println("Rakamlarin toplami: " + toplam);
    }

    //Kullanicidan 3 int alan ve 2. girilen int degeri diger degerlerin ortalamasi ise TRUE, degilse FALSE donduren metod.
    static boolean deger(int sayi1, int sayi2, int sayi3){
        return sayi2 == ((sayi1 + sayi3) / 2);
    }

}