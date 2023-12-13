//Kutuphane sinifi. Main sinifi.
public class Library {
    public static void main(String[] args) {
        ManagementSystem librarySystem = new ManagementSystem();//Kutuphane sistemi olusturmak.

        Book book1 = new Book("Rich Dad & Poor Dad", 2000, "Robert t. Kiyosaki");//1. kitap olusturmak.
        librarySystem.addBook(book1);//1. kitabi arrayList'e eklemek.

        Book book2 = new Book("The Alchemist", 1988, "Paulo Coelho");//2. kitap olusturmak.
        librarySystem.addBook(book2);//2. kitabi arrayList'e eklemek.

        Book book3 = new Book("Atomic Habits", 2012, "James Clear");//3. kitap olusturmak
        librarySystem.addBook(book3);//3. kitabi arrayList'e eklemek.

        librarySystem.getBook("Rich Dad & Poor Dad");//Kitabi ismiyle aramak.

        Book book4 = new Book("Rich Dad & Poor Dad", 2005, "Robert t. Kiyosaki");//4. kitap olusturmak.
        librarySystem.addBook(book4);//4. kitabi arrayList'e eklemek.

        librarySystem.displayBookInfo();//Kitaplari okumak.
        librarySystem.removeBook(book4);//4. kitabi silmek.
        System.out.println("Kitaplar silme islemi yaptiktan sonra: ");
        librarySystem.displayBookInfo();//4. kitabi sildikten sonra kitaplari okumak.

        librarySystem.updateBook(book4);//1. kitap nesnesini 4.kitap nesnesiyle yayin yilini guncellemek.
        System.out.println("1. kitap guncelledikten sonra: ");
        librarySystem.books.getFirst().printDetails();
        System.out.println();

        Author author1 = new Author("Robert Toru Kiyosaki (born April 8, 1947) is a Japanese-American businessman and author.");//1. yazar nesnesi olusturmak.
        librarySystem.addAuthor(author1);//1. yazar nesnesini arrayList'e eklemek.
        librarySystem.displayAuthorInfo();

        User borrower1 = new Borrower("Arsalan", "Ulus");//1. Odunc alan nesnesi olusturmak.
        librarySystem.addBorrower(borrower1);//1. Odunc alan nesnesini arrayList'e eklemek.
        User borrower2 = new Borrower("Amir", "HaciBayram");//2. Odunc alan nesnesi olusturmak.
        librarySystem.addBorrower(borrower2);//2. Odunc alan nesnesini arrayList'e eklemek.
        librarySystem.displayBorrowersInfo();//Odunc alan kullanicilari okumak.

        BorrowedBooks borrowedBook1 = new BorrowedBooks("Rich Dad Poor Dad", 2005, "Robert Kiyosaki.");//1.odunc alinan kitabin nesnesi olusturmak.
        librarySystem.addBorrowedBook(borrowedBook1);//1. odunc alinan kitabini arrayList'e eklemek.
        BorrowedBooks borrowedBook2 = new BorrowedBooks("The Alchemist", 1988, "Paulo Coelho");//2.odunc alinan kitabin nesnesi olusturmak.
        librarySystem.addBorrowedBook(borrowedBook2);//2. odunc alinan kitabini arrayList'e eklemek.
        librarySystem.displayBorrowedBooksInfo();//Odunc alinan kitaplari okumak
    }
}