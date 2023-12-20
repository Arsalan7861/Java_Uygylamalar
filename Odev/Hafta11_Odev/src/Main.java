//Main sinifi.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String dosyaIsmi = "Books.txt";//Olusan dosyanin ismi.
        Book book1 = new Book("The tale of two cities","Charles Dickens",1859, 1234234343);
        Library.kitapEkle(book1);//Kitabi kitap listine eklemek.
        Book book2 = new Book("The little prince","Antoine de SAint Exupery",1943, 355634565);
        Library.kitapEkle(book2);
        Book book3 = new Book(" Hobbit","J.R TolkienThe",1937, 343344556);
        Library.kitapEkle(book3);
        Book book4 = new Book("The Alchemist","Paulo Coelho",1988, 35667354);
        Library.kitapEkle(book4);

        System.out.println("****Menu****");
        System.out.println("1. Kitap eklemek.");
        System.out.println("2. Kitap listelemek.");

        int secim;
        String isim = null;
        String yazar = null;
        int yayinYili;
        int isbn;

        Scanner s = new Scanner(System.in);

        do {
            try {
                System.out.print("Yapmak istediginiz islemi seciniz(1 veya 2):");
                if (s.hasNextInt()){
                    secim = s.nextInt();
                    s.nextLine();//
                }else throw new CustomException();
                if (secim == 1){
                    do {
                        try {
                            System.out.print("Kitabin ismi: ");
                            isim = s.nextLine();
                            if (isim.isEmpty())
                                throw new IllegalArgumentException();//Bos bir deger girildiginde exception firlatmak.
                            System.out.print("Kitabin yazari: ");
                            yazar = s.nextLine();
                            if (yazar.isEmpty())
                                throw new IllegalArgumentException();//Bos bir deger girildiginde exception firlatmak.
                        } catch (IllegalArgumentException e) {
                            System.out.println("Bos deger girilemez!");
                        }
                    } while (isim.isEmpty() || yazar.isEmpty());

                    do {
                        try {//integer deger yerine String degerin girilmesini CustomException sinifina firlatmak.
                            System.out.print("Kitabin yayin yili: ");
                            if (s.hasNextInt()) {
                                yayinYili = s.nextInt();
                            } else throw new CustomException();
                        } catch (CustomException e) {
                            System.out.println(e.getMessage() + ": Yanlis karakter!!");
                            s.nextLine();
                            yayinYili = 0;
                        }
                    } while (yayinYili == 0);

                    do {
                        Scanner c = new Scanner(System.in);
                        try {//integer deger yerine String degerin girilmesini CustomException sinifina firlatmak.
                            System.out.print("Kitabin ISBN'i: ");
                            if (c.hasNextInt()) {
                                isbn = c.nextInt();
                            } else throw new CustomException();
                        } catch (CustomException e) {
                            System.out.println(e.getMessage() + ": Yanlis karakter!!");
                            c.nextLine();
                            isbn = 0;
                        }
                    } while (isbn == 0);

                    Book book = new Book(isim, yazar, yayinYili, isbn);//Kitap nesneni olusturmak.
                    Library.kitapEkle(book);//Liste eklemek.
                    System.out.println("Kitap eklendi.");
                    Library.kitapListele(book);//Kitap eklendikten sonra kitapListele metoduyla ekrana yazdirmak.
                } else if (secim == 2) {
                    int i = 1;
                    System.out.println("Mevcut Kitaplar:");
                    for (Book book : Library.books) {
                        System.out.println(i + ". kitap:");
                        book.bilgiYazdir();
                        i++;
                    }
                    System.out.println();

                    int secim1;
                    do {
                        System.out.print("Hangi kitabi dosyaya yazdirmak istiyorsunuz?");
                        secim1 = s.nextInt();
                        switch (secim1) {
                            case 1:
                                Library.kitapYazdir(book1, dosyaIsmi);
                                System.out.println("Kitab yazildi.");
                                break;
                            case 2:
                                Library.kitapYazdir(book2, dosyaIsmi);
                                System.out.println("Kitab yazildi.");
                                break;
                            case 3:
                                Library.kitapYazdir(book3, dosyaIsmi);
                                System.out.println("Kitab yazildi.");
                                break;
                            case 4:
                                Library.kitapYazdir(book4, dosyaIsmi);
                                System.out.println("Kitab yazildi.");
                                break;
                            default:
                                System.out.println("Yanlis secim!!");
                        }
                    } while (secim1 > 4 || secim1 <= 0);
                    Library.kitapGetir(dosyaIsmi);
                } else System.out.println("Yanlis secim!");
            }catch (CustomException e){
                System.out.println(e.getMessage() + ": Yanlis karakter!");
                s.nextLine();//inputun temizlenmesi.
                secim = 0;//Sonsuz donguyu onlemek icin sifirlamak.
            }
        }while (secim != 1 && secim != 2);
    }
}
