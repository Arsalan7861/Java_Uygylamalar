//Celsius degerlerini fahrenheita cevirme uygulamasi.
public class Uygulama_2 {
    public static void main(String[] args) {
        double fahrenhiet;
        double celcius;
        for (celcius = 20; celcius <= 35 ; celcius++){
            fahrenhiet = (celcius*9/5) + 32;// Celsius'u fahrenhiet'a ceviren formulu.
            System.out.println("Celcius degeri: " + celcius + ", Fahrenheit degeri: " + fahrenhiet);
        }
    }
}
