//Uygulama 2, Hesap makinesi.k
public class Main {
    public static void main(String[] args) {
        System.out.println("Iki int degerin toplami = " + HesapMakinesi.topla(2, 3));
        System.out.println();
        System.out.println("Iki double degerin toplami = " + HesapMakinesi.topla(2.3, 3.3));
        System.out.println();
        System.out.println("Iki int degerin carpimi = " + HesapMakinesi.carp(2, 3));
        System.out.println();
        System.out.println("Iki doubel degerin carpimi = " + HesapMakinesi.carp(2.4, 3.5));
        System.out.println();
        System.out.println("Uc double degerin carpimi = " + HesapMakinesi.carp(2.4, 3.5, 5.6));
    }
}
