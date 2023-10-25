//Uygulama 2 main metodu.
public class Main {
    public static void main(String[] args) {
        //Constructor ile deger atama.
        Oyuncu oyuncu1 = new Oyuncu("Arsalan", 1, 99.5f);

        //Oyuncu sinifindan yazdir metodun cagirilmasi.
        oyuncu1.yazdir();
    }
}