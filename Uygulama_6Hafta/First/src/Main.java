//Uygulama 1 main metodu.
public class Main {
    public static void main(String[] args){
        Kutu kutu = new Kutu();
        kutu.uzunluk = 3;
        kutu.yukseklik = 4;
        kutu.genislik = 5;

        //Kutu sinifindan yazdir metodun cagirilmasi.
        Kutu.yazdir(kutu.uzunluk, kutu.genislik, kutu.yukseklik);

        //Kutu sinifindan hacimHesapla metodun cagirilmasi.
        Kutu.hacimHesapla(kutu.uzunluk, kutu.genislik, kutu.yukseklik);
    }
}
