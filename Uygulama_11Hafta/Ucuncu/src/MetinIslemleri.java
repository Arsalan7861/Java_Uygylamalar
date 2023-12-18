//Uygulama 3 Metin Islemleri.
import java.io.*;
public class MetinIslemleri {
    public static void main(String[] args){
        String dosyaIsmi = "Metin.txt";//Dosyanin ismi.
        PrintWriter printWriter = null;//PrintWriter nesnesi olusturmak.
        try {//Metin dosyasi olusturmak.
            printWriter = new PrintWriter(new FileOutputStream(dosyaIsmi));
            System.out.println("Metin dosyasi olusturuldu.");
        }catch (FileNotFoundException e) {
            System.out.println(dosyaIsmi + "olustururken hata olustu.");
            System.exit(0);
        }
        //Metin dosyasina kaydetmek.
        printWriter.println("Metin dosyasina Hos geldiniz.");
        printWriter.println("PrintWriter ve BufferedWriter kullanimi.");
        printWriter.close();//Dosyayi kapat.
        BufferedReader bufferedReader = null;
        try {//Dosyayi okumak.
            bufferedReader = new BufferedReader(new FileReader(dosyaIsmi));
            String satir = bufferedReader.readLine();
            System.out.println("Metin dosyasindaki 1. satiri: " + satir);
            satir = bufferedReader.readLine();
            System.out.println("Metin dosyasindaki 2. satiri: " + satir);
        } catch (FileNotFoundException e) {
            System.out.println(dosyaIsmi + " bulunamadi veya acilamadi.");
        } catch (IOException e){
            System.out.println(dosyaIsmi + " dosyasindan veri girisinde hata olustu.");
        }
    }
}