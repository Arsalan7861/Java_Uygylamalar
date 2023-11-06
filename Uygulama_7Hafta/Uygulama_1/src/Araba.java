public class Araba {
    private String marka;
    private String model;
    private int uretimYili;
    static int sayac;

    //Constructor.
    public Araba(String marka, String model, int uretimYili){
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
        sayac++;
    }

    public void yazdir(){
        System.out.println(sayac + ". Araba: ");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Uretim Yil: " + uretimYili);
    }

}
