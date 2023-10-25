//Bir kelimenin palindrom olup olmadigini kontrol eden uygulama.
import java.util.Scanner;

public class hafta5Odev {
    public static void main(String[] args) {
        String kelime;

        Scanner input = new Scanner(System.in);

        System.out.print("En az 5 ve en fazla 7 karakter bir kelime giriniz:");
        kelime = input.nextLine();

        //Kelimenin en az 5 karakter, en fazla 7 karakterden ve sayidan olusup olusmadigini kontrol etme kosulu.
            if (kelime.length() > 7) {
                System.out.println("En fazla 7 karakter olsun.");
            } else if (kelime.length() < 5) {
                System.out.println("En az 5 karakter olsun.");
            } else if (kelime.matches(".*\\d.*")) {
                System.out.println("Sayi olmasin.");
            } else {
                if (palindromMu(kelime)){
                    System.out.println(kelime + " palindrom bir kelimedir.");
                }else {
                    System.out.println(kelime + " palindrom bir kelime degildir.");
                }
            }

    }

    //Kelimenin palindrom olup olmadigini kontrol etme metodu.
    static boolean palindromMu(String kelime){
        kelime = kelime.toLowerCase();// kelimenin karakterlerini kucuk karakterlere donusturuyor.
        int sag = 0; //Sagdaki karakter.
        int sol = kelime.length() - 1;
        while (sag < sol){
            if (kelime.charAt(sag) != kelime.charAt(sol)){
                return false; //ilk karakter sondaki ilk karakterle esit olmadigi durumunda false donduruyor.
            }
            sag++;
            sol--;
        }
        return true;
    }
}
