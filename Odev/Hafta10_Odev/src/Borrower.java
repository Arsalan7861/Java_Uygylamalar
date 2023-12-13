//Odunc alan kullanici User soyut sinifinin alt sinifi.
public class Borrower extends User{
    //Constructor.
    public Borrower(String adi, String adres) {
        super(adi, adres);
    }

    //Odunc alan kullanicinin bilgilerini yazdiran metod.
    @Override
    public void displayUserInfo() {
        System.out.println("Adi: " + getName());
        System.out.println("Adres: " + getAddress());
    }
}
