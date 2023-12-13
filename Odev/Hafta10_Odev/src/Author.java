//Yazar sinifi. Book sinifinin alt sinifi.
public class Author{
    private String bio;//Yazarin biyografisi.

    //Set ve get metodlari.
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getBio() {
        return bio;
    }//Set ve get metodlarin sonu..
    //Constructor.
    public Author(String bio){
        this.bio = bio;
    }
    //Yazarin bilgilarini yazdiran metod.
    public void printDetails() {
        System.out.println("Yazarin Biyografisi: " + bio);
    }
}
