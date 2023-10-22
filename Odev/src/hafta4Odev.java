//Kullanicin istedigi kadar sayiyi toplayabilecegi, cikartabilecegi, carpabilecegi ve bolebilecegi uygulama.
import java.util.Scanner;
public class hafta4Odev {
    static int islemTuru;// Global degisken, Programin sonuna kadar calisiyor.
    static String islemler;// Global degisken, Programin sonuna kadar calisiyor.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Kullanicidan aldigimiz sayinin atandigi scanner sinifi.

        System.out.println("1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme");
        System.out.print("-->Islem turunu seciniz (1, 2, 3, 4):");
        islemTuru = scan.nextInt();

        //Secildigi islem turune gore kullanicinin yapmak isdetigi islemin ekrana yazdirilmasi.
        if (islemTuru == 1) islemler = "Toplamak";
        else if (islemTuru == 2) islemler = "Cikartmak";
        else if (islemTuru == 3) islemler = "Carpmak";
        else if (islemTuru == 4) islemler = "Bolmek";

        //Islem metodun cagirmasi.
        islem();

    }


    //Islem metodu.
    public static void islem (){
        float sayi = 0;
        float toplam = 0;
        int a = 1;

        Scanner sc = new Scanner(System.in);//Sayinin atandigi sinif.
        do {

            if (islemTuru <= 4) System.out.print(islemler + " istediginiz sayiyi giriniz:");
            else {System.out.println("Yanlis Sectiniz."); break;}


            if(a != 1) sayi = sc.nextFloat();

            //Ilk sayiyi saklamak icin.
            if(a == 1)
            {
                toplam = sc.nextFloat();
                sayi = toplam;
            }

            if(a <= 4) a++;

            //Kullanici eksi bir deger girdiginde uyari verme kosulu.
            if (sayi < 0) {
                String cevap;
                System.out.println("Eksi bir deger girdiniz devam etmek ister misin?(Evet icin e Hayir icin h tusunu basiniz.)");
                cevap = sc.next();
                if (cevap.equalsIgnoreCase("e")) {
                    continue;
                } else if (cevap.equalsIgnoreCase("h")) {
                    sayi = -1 * sayi;
                } else {
                    System.out.println("Yanlis karakter!!!");
                }
            }

            //Secildigi isleme gore hesaplama kosulu.
            if(a != 2) {
                switch (islemTuru) {
                    case 1: toplam += sayi; break;
                    case 2: toplam -= sayi; break;
                    case 3: if (sayi != 0) toplam *= sayi; break;
                    case 4: if (sayi != 0) toplam /= sayi; break;
                }
            }

        }while (sayi != 0);

        //Toplmin yazdirilmasi.
        if(islemTuru <= 4) System.out.println("Toplam = " + toplam);
    }
}
