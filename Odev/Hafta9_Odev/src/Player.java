//Player sinifi.
public class Player {
    private String name;
    private int age;
    private String position;
    private int matchesPlayed;
    //Set metodlar.
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }//Set metodlarin sonu.

    //Oyuncunun bilgilerini ekrana yazdiran metod.
    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Position: " + this.position);
        System.out.println("Matches Played: " + this.matchesPlayed);
    }
}