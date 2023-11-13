//Uygulama 3 Main sinifi.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Amir", "Arsalan", new double[]{23.5, 96.5, 56.7});
        Ogrenci ogrenci2 = new Ogrenci("Amir", "Arsalan", new double[]{23.5, 96.5, 56.7});
        Ogrenci ogrenci3 = new Ogrenci("Amir", "Arsalan", new double[]{23.5, 96.5, 56.7});

        Ogrenci[] ogrenciler = new Ogrenci[]{ogrenci1, ogrenci2, ogrenci3};
        System.out.println("1. Ogrenci : ");
        ogrenciler[0].bilgiYazdir();
        System.out.println("2. Ogrenci : ");
        ogrenciler[1].bilgiYazdir();
        System.out.println("2. Ogrenci : ");
        ogrenciler[2].bilgiYazdir();

    }
}