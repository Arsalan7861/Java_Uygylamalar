//Kullanici soyut sinifi.
public abstract class User {
    private String name;//Kullanicinin ismi.
    private String address;//Kullanicinin adresi.
    //Set ve get metodlari.
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }//Set ve get metodlarin sonu.
    //Constructors.
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void displayUserInfo();//Kullanicinin bilgilerini yazdiran abstract metodu.
}