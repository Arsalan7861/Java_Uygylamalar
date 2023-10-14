//Bir turizm şirketi için satın alan turları hesaplama uygulaması.
import java.util.Scanner;

public class Uygulama_2 {
    public static void main(String[] args){

        //Değişkenler.
        String grup;
        String cevap;

        Scanner scan = new Scanner(System.in);
        System.out.println("Grup turunu yaziniz (Kuzey Amerika, Avrupa, Asya) :");
        grup = scan.nextLine();

        //Girilen turunun Detayları gösteren koşul fonksiyonu.
        switch (grup.toLowerCase()){
            case "kuzey amerika" : System.out.print("Kuzey Amerika"); break;
            case "avrupa" : System.out.println("Avrupa"); break;
            case "asya" : System.out.println("Asya"); break;
            default: System.out.println("Yanlis turu girdiniz.");
        }

        System.out.print("Satin almak ister misiniz? (Evet icin e, Hayir icin h yaziniz)");
        Scanner sc = new Scanner(System.in);
        cevap = sc.nextLine();


        //Kullanıcıya girdiği cevapa göre yanıtlama koşul fonksiyonu.
        if (cevap.equals("e")){
            System.out.println("Ucret kartinizdan cekilmistir.");
        } else if (cevap.equals("h")) {
            System.out.println("Sistemden cikis yapiliyor.");
        }
        else {
            System.out.println("Yanlis karekteri girdiniz.");
        }
    }
}
