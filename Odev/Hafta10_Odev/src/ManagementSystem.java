import java.util.ArrayList;

//Kutuphanenin islemlerini kontrol eden ManagementSystem sinifi.
public class ManagementSystem {
    ArrayList<Book> books = new ArrayList<>();//Kitaplari saklayacak arraylist.
    ArrayList<BorrowedBooks> borrowedBooks = new ArrayList<>();//Odunc alinan kitaplari saklayacak arraylist.
    ArrayList<User> borrowers = new ArrayList<>();//Odunc alanlari saklayacak arraylist.
    ArrayList<Author> authors = new ArrayList<>();//Yazarlari saklayacak arraylist.

    //Kitap ekleme ve silme metodlari.
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    //Odun alinan kitap ekleme ve silme metodlari.
    public void addBorrowedBook(BorrowedBooks bb){
        borrowedBooks.add(bb);
    }
    public void removeBorrowedBook(BorrowedBooks bb){
        borrowedBooks.remove(bb);
    }
    //Odunc alan ekleme ve silme metodlari.
    public void addBorrower(User borrower){
        borrowers.add(borrower);
    }
    public void removeBorrower(User borrower){
        borrowers.remove(borrower);
    }
    //Yazar ekleme ve silme metodlari.
    public void addAuthor(Author author){
        authors.add(author);
    }
    public void removeAuthor(Author author){
        authors.remove(author);
    }
    //Kitaplarin bilgilerini okumak.
    public void displayBookInfo() {
        int sayac = 1;
        System.out.println("Kitaplar: ");
        for (Book book : books) {
            System.out.println(sayac + ". Book: ");
            book.printDetails();
            sayac++;
        }
        System.out.println();
    }
    //Yazarlarin bilgilerini okumak.
    public void displayAuthorInfo() {
        System.out.println("Yazarlar: ");
        int sayac = 1;
        for (Author author : authors) {
            System.out.println(sayac + ". Yazar: ");
            author.printDetails();
            sayac++;
        }
        System.out.println();
    }
    //Odun alinan kitaplarin bilgilerini okumak.
    public void displayBorrowedBooksInfo() {
        int sayac = 1;
        System.out.println("Odunc alinan Kitaplar: ");
        for (BorrowedBooks bb : borrowedBooks) {
            bb.setBorrowedBooksCount(sayac);//Odunc alinan kitaplari saymak.
            System.out.println(sayac + ". Kitap: ");
            bb.printDetails();
            sayac++;
        }
        System.out.println();
    }
    //Odunc alanlarin bilgilerini okumak.
    public void displayBorrowersInfo() {
        int sayac = 1;
        System.out.println("Odunc alanlar: ");
        for (User b : borrowers) {
            System.out.println(sayac + ". Kisi: ");
            b.displayUserInfo();
            sayac++;
        }
        System.out.println();
    }
    //Kitap arama metodu.
    public void getBook(String name){
        System.out.println("Aradiginiz kitap: ");
        for (Book book: books){
            if (book.getName().equals(name)){
                book.printDetails();
            }
        }
        System.out.println();
    }
    //Kitap guncelleme metodu.
    public void updateBook(Book book){
        for (Book book1: books){
            if (book1.getName().equals(book.getName())){
                books.set(books.indexOf(book1), book);
            }
        }
    }
}
