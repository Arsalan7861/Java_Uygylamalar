//Student sinifi.
public class Student {
    private String ad;
    private int ogrenciNo;
    private double ortNot;

    public String getAd() {
        return ad;
    }
    public int getOgrenciNo() {
        return ogrenciNo;
    }
    public double getOrtNot() {
        return ortNot;
    }
    public Student(String ad, int ogrenciNo, double ortNot) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
        this.ortNot = ortNot;
    }

    public void displayInfo(){
        System.out.println("Isim: " + ad);
        System.out.println("Ogrenci NO: " + ogrenciNo);
        System.out.println("Not Ortalamasi: " + ortNot);
    }
}
