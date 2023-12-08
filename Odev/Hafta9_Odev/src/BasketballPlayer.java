//Player sinifindan turetilmis BasketballPlayer sinifi.
public class BasketballPlayer extends Player{
    private int rebounds;
    private int passes;

    //Set metodlar.
    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }
    public void setPasses(int passes) {
        this.passes = passes;
    }//Set metodlarin sonu.

    //Player sinifindaki printDetails metodu override etmek.
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Rebounds: " + this.rebounds);
        System.out.println("Passes: " + this.passes);
    }
}