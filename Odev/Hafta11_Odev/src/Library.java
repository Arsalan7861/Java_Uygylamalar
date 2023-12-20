//Library sinifi.
import java.io.*;
import java.util.ArrayList;

public class Library {
    static ArrayList<Book> books = new ArrayList<>();//Kitablari saklayan ArrayList.
    //Kitabi kitap listine ekleme metodu.
    public static void kitapEkle(Book book){
       books.add(book);
    }
    //Istendigi kitabin ozelliklerini ekrana yazdirma metodu.
    public static void kitapListele(Book book){
       book.bilgiYazdir();
    }
    //Secilen kitabi dosyaya yazdirma metodu.
    public static void kitapYazdir(Book book, String dosyaIsmi){
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream(dosyaIsmi));
        }catch (FileNotFoundException e){
            System.out.println(dosyaIsmi + " dosyasi olusma esnasinda hata olustu!");
        }
        printWriter.print("--> ISBN: " + book.getIsbn());
        printWriter.print(", Isim: " + book.getIsim());
        printWriter.print(", Yazar: " + book.getYazar());
        printWriter.println(", Yayin yili: " + book.getYayinYili());
        printWriter.close();
    }
    //Dosyayi okuma metodu.
    public static void kitapGetir(String dosyaIsmi){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaIsmi));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadi!");
        } catch (IOException e){
            System.out.println("Hata olustu!");
        }
    }
}
