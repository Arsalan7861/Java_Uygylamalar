//Team sinifi.
import java.util.ArrayList;
import java.util.Iterator;

public class Team {
    ArrayList<FootballPlayer> footballPlayers = new ArrayList<>();//FootballPlayer sinifindan turetilmis olan nesneleri saklamak icin olusturulmus ArrayList.
    ArrayList<BasketballPlayer> basketballPlayers = new ArrayList<>();//BasketballPlayer sinifindan turetilmis olan nesneleri saklamak icin olusturulmus ArrayList.
    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer();//1. Futbol oyuncunun nesnesini olusturmak.
        footballPlayer1.setName("Lionel Messi");
        footballPlayer1.setAge(32);
        footballPlayer1.setPosition("RM");
        footballPlayer1.setMatchesPlayed(700);
        footballPlayer1.setGoals(900);
        footballPlayer1.setAssists(500);

        FootballPlayer footballPlayer2 = new FootballPlayer();//2. Futbol oyuncunun nesnesini olusturmak.
        footballPlayer2.setName("Cristiano Ronaldo");
        footballPlayer2.setAge(34);
        footballPlayer2.setPosition("ST");
        footballPlayer2.setMatchesPlayed(750);
        footballPlayer2.setGoals(800);
        footballPlayer2.setAssists(400);

        BasketballPlayer basketballPlayer1 = new BasketballPlayer();//1. Basketbol oyuncunun nesnesini olusturmak.
        basketballPlayer1.setName("Lebron James");
        basketballPlayer1.setAge(36);
        basketballPlayer1.setPosition("Forwars");
        basketballPlayer1.setMatchesPlayed(800);
        basketballPlayer1.setRebounds(1200);
        basketballPlayer1.setPasses(600);

        Team team = new Team();//Team sinifindan nesne olusturmak.
        team.addFootballPlayer(footballPlayer1);//1. Futbol Oyuncuyu Metod vasitasiyla footballPlayers Arraylistine eklemek.
        team.addFootballPlayer(footballPlayer2);//2. Futbol Oyuncuyu Metod vasitasiyla footballPlayers Arraylistine eklemek.
        team.addBasketballPlayer(basketballPlayer1);//1. Basketbol Oyuncuyu Metod vasitasiyla basketballPlayers Arraylistine eklemek.

        team.displayTeam();//Tum oyuncularin bilgilerini displayTeam metodun vasitasiyla ekrana yazdirmak.
    }

    //FootballPlayer sinifindan turetilmis olan nesneleri footballPlayers ArrayListine ekleme metodu.
    public void addFootballPlayer(FootballPlayer player){
        footballPlayers.add(player);
    }

    //BasketBall sinifindan turetilmis olan nesneleri basketballPlayers ArrayListine ekleme metodu.
    public void addBasketballPlayer(BasketballPlayer player){
        basketballPlayers.add(player);
    }

    //Tum oyuncularin bilgilerini ekrana yazdirma metodu.
    public void displayTeam(){
        //footballplayers ArrayList'teki nesneleri iterator ile ekrana yazdirmak.
        Iterator<FootballPlayer> iterator = footballPlayers.iterator();
        System.out.println("Futbol Takimi:");
        while (iterator.hasNext()) {
            FootballPlayer footballPlayer = iterator.next();
            footballPlayer.printDetails();
            System.out.println();
        }
        //basketballplayers ArrayList'teki nesneleri iterator ile ekrana yazdirmak.
        Iterator<BasketballPlayer> iterator1 = basketballPlayers.iterator();
        System.out.println("Basketbol Takimi:");
        while (iterator1.hasNext()) {
            BasketballPlayer basketballPlayer = iterator1.next();
            basketballPlayer.printDetails();
            System.out.println();
        }
    }
}