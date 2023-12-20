//Book sinifi
public class Book {
    private String isim;
    private String yazar;
    private int yayinYili;
    private int isbn;

    public String getIsim() {
        return isim;
    }
    public String getYazar() {
        return yazar;
    }
    public int getYayinYili() {
        return yayinYili;
    }
    public int getIsbn() {
        return isbn;
    }
    public Book(String isim, String yazar, int yayinYili, int isbn) {
        this.isim = isim;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.isbn = isbn;
    }
    //Kitabin bilgilerini ekrana yazdiran metod.
    public void bilgiYazdir(){
        System.out.print("ISBN: " + isbn);
        System.out.print(", Isim: " + isim);
        System.out.print(", Yazar: " + yazar);
        System.out.println(", Yayin Yili: " + yayinYili);
    }
}
