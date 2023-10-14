// 1'den girilen sayıya kadar syıların toplamını hesaplama uygulaması.
import java.util.Scanner;

public class Uygulama_3_2 {
    public static void main(String[] args){
        int sayi;
        int toplam = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("1'den hangi sayiya kadar toplamak istedigin sayiyi yaziniz: ");
        sayi = sc.nextInt();
        for (int a = sayi; a >= 1; a--){
            toplam += a;
        }
        System.out.println("Sayilarin Toplami: " + toplam);
    }
}
