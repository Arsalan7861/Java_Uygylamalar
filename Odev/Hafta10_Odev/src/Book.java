//Kitap sinifi.
public class Book {
    private String name;//Kitabin ismi.
    private int publishedYear;//Kitabin yayin yili.
    private String author;//Kitabin yazari.

    //Set ve get metodlari.
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }//Set ve get metodlarin sonu.
    //Prametreli Constructor.
    public Book(String name, int publishedYear, String author) {
        this.name = name;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    //Kitabin bilgilerini yazdiran metod.
    public void printDetails(){
        System.out.println("Kitabin adi: " + name);
        System.out.println("Kitabin yayin yili: " + publishedYear);
        System.out.println("Kitabin yazari: " + author);
    }
}
