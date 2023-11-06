//Uygulama 1 kutu sinifi
public class Kutu {
    public int uzunluk;
    public int genislik;
    public int yukseklik;

    //Ozelliklerini yazdiran metod.
    public static void yazdir(int a, int b, int c){
        System.out.println("Uzunluk = " + a + "\nGenislik = " + b + "\nYukseklik = " + c);
    }

    //Hacimi hesaplayan metod.
    public static void hacimHesapla(int a, int b, int c){
        System.out.println("Hacim = " + a * b * c);
    }
}