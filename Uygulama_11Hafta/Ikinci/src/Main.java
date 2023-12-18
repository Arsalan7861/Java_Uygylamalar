//Main sinifi.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("23", 12343, -90.5);
        student.displayInfo();
        System.out.println();
        try {
            if (student.getOrtNot() < 0)//Ogrenci numaranin eksi olup olmadigini kontrol edip IllegalArgumentException'a firlatmak.
                throw new IllegalArgumentException("Not ortlamasi eksi olamaz.");

            for (char c : student.getAd().toCharArray()) {//Isimde sayinin olup olmadigi kontrol edip Exception'a firlatmak.
                if (Character.isDigit(c)) {
                    throw new Exception("Isim sayidan olusulamaz!");
                }
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}
