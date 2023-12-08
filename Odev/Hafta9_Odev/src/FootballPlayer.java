//Player sinifindan turetilmis FootballPlayer sinifi.
public class FootballPlayer extends Player {
    private int goals;
    private int Assists;

    //Set metodlar.
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public void setAssists(int assists) {
        Assists = assists;
    }//Set metodlarin sonu.

    //Player sinifindaki printDetails metodu override etmek.
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Goals Scored: " + this.goals);
        System.out.println("Assists: " + this.Assists);
    }
}