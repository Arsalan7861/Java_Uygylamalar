//Uygulama 3. Ogrenci bilgi sistemi.
public class Main {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Amir", "Arsalan", new int[]{2, 3, 5});
        ogrenci1.yazdir();
        System.out.println("Ortalama = " + ogrenci1.ortHesapla());
    }
}
