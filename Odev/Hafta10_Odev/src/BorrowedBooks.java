//Odunc alinan kitaplarin sinifi. Book sinifinin alt sinifi.
public class BorrowedBooks extends Book{
    private int borrowedBooksCount;//Odunc alinan kitaplarin sayisi.
    //Set ve get metodlari.
    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }
    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }//Set ve get metodlarin sonu.

    //Constructors.
    public BorrowedBooks(String name, int publishedYear, String author) {
        super(name, publishedYear, author);
    }

    //Odunc alinan kitapin bilgisini yazdiran metod.
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Odunc alinan kitaplarin sayisi: " + borrowedBooksCount);
    }
}