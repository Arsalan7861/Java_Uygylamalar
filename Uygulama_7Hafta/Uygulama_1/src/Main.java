//Uygulama 1.
public class Main {
    public static void main(String[] args) {
        int sayac;
        Araba araba1 = new Araba("Ferrari", "3", 2000);
        araba1.yazdir();
        Araba araba2 = new Araba("Ferrari", "3", 2000);
        araba2.yazdir();
        Araba araba3 = new Araba("Ferrari", "3", 2000);
        araba3.yazdir();

        sayac = Araba.sayac;
        System.out.println(sayac + " tane nesne olusturuldu.");
    }
}
