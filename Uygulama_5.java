//Öğrencilerin AGNO'larını hesaplama uygulaması.
import java.util.Scanner;

public class Uygulama_5 {
    public static void main(String[] args){
        int ders_kredisi;//Ders kredileri.
        float ders_notu;//Ders notları.
        float agno = 0;//AGNO
        int ders_adeti = 0;//Dersin sayıları.
        int toplam_kredisi = 0;//Toplam ders kredileri.
        float toplam_notu = 0;//Toplam ders notları.
        float toplam_a = 0;//Ders notuyla ders kredilerin çarpımlarının toplamı.
        String cevap;//Kullanıcı ders notunu girmeyi devam etmesi için verdiği cevap.

        Scanner sc = new Scanner(System.in);//ders_kredisi ve ders_notu için tanımlanan sınıf.
        Scanner scan = new Scanner(System.in);//cevap değişkeni için tanımlanan sınıf.

        do {
            System.out.print("Ders kredinizi giriniz: ");
            ders_kredisi = sc.nextInt();
            System.out.print("Ders notunuzu giriniz: ");
            ders_notu = sc.nextFloat();
            toplam_notu += ders_notu;
            ders_adeti++;
            toplam_kredisi += ders_kredisi;
            toplam_a += (ders_notu * ders_kredisi);

            //Yanlış tuş basılma durumunda tekrar cevap isteme döngüsü.
            do {
                System.out.print("--> Devam etmek ister misiniz? (Evet icin e Hayir icin h karekterini basiniz).");
                cevap = scan.nextLine();

                if (!cevap.toLowerCase().equals("e") && !cevap.toLowerCase().equals("h")){
                    System.out.println("Yanlis tusunu bastiniz, tekrar deneyiniz");
                }

            }while(!cevap.toLowerCase().equals("e") && !cevap.toLowerCase().equals("h"));


        }while (!cevap.toLowerCase().equals("h"));

        System.out.println("Ders sayisi: " + ders_adeti);

        agno = toplam_a/toplam_kredisi;//AGNO hesaplaması. toplam_a katsayıyla ders notunun çarpımların toplamı.
        //System.out.println("AGNO: " + agno);
        System.out.printf("AGNO: %.2f\n", agno);//'%.2f' Noktadan sonra sadece iki basamağı yazdırıyor.

        //Öğrencinin AGNO'suna göre belge verme koşulu.
        if (3.00 <= agno && agno <3.50){
            System.out.println("****TEBRIKLER! Onur Belgesini kazandiniz.****");
        } else if (3.50 <= agno && agno <= 4.00) {
            System.out.println("****TEBRIKLER! Yuksek Onur Belgesini kazandiniz.****");
        }
    }
}