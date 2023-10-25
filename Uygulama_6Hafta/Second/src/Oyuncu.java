//Uygulama 2 oyuncu sinifi.
public class Oyuncu {
     String isim;
     int seviye;
     double puan;

     //Constructor.
    public Oyuncu(String isim, int seviye, float puan) {
        this.isim = isim;
        this.seviye = seviye;
        this.puan = puan;
    }

    //Oyuncunun bilgilerini ekrana yazdirma metodu.
    public void yazdir(){
        System.out.println("Oyuncunun ismi : " + isim);
        System.out.println("Oyuncunun seviyesi : " + seviye);
        System.out.println("Oyuncunun puani : " + puan);
    }
}
