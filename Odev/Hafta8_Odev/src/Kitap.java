//8. Haftanin Odevi Kitap sinifi
public class Kitap {
    private String ad;
    private String yazar;
    private int yayinYili;

    public Kitap(String ad, String yazar, int yayinYili) {
        this.ad = ad;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public String getYazar() {
        return yazar.toLowerCase();
    }

    //Kitaplarin bilgilerini yazdirma metodu.
    public void bilgiYazdir(){
        System.out.println("Kitabin adi : " + ad);
        System.out.println("Kitabin yazari : " + yazar);
        System.out.println("Kitabin yayin yili : " + yayinYili);
    }


    //toString metodu daha iyi okunabilmesi icin olusturmak.
    @Override
    public String toString() {
        return "Kitap{" +
                "ad='" + ad + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayinYili=" + yayinYili +
                '}';
    }
}
