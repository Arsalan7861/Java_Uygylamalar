public class Hesap {
    private String hesapNo;
    private String ad;
    private double bakiye;
    static int sayac;

    //set metodu ile hesapNo'sina deger atamak.
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    //get metodu ile hesapNo'i cagirmak.
    public String getHesapNo() {
        return hesapNo;
    }
    //set metodu ile ad'a deger atamak.
    public void setAd(String ad) {
        this.ad = ad;
    }
    //get metodu ile ad'i cagirmak.
    public String getAd() {
        return ad;
    }
    //set metodu ile bakiye'e deger atamak.
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    //get metodu ile bakiye'i cagirmak.
    public double getBakiye() {
        return bakiye;
    }

    //Toplam olusturulan hesap sayisini hesapla.
    public void hesapSayaci(){
        sayac++;
    }

    //Yatirilan miktari int olarak alip bakiyeye atamak
    public void yatirma(int yatirilan){
        bakiye += yatirilan;
    }
    //Yatirilan miktari double olarak alip bakiyeye atamak
    public void yatirma(double yatirilan){
        bakiye += yatirilan;
    }
    //Cekilen miktari int olarak alip bakiyeye atamak.
    public double cekme(int cekilen){
        bakiye -= cekilen;
        return cekilen;
    }
    //Cekilen miktari double olarak alip bakiyeye atamak.
    public double cekme(double cekilen){
        bakiye -= cekilen;
        return cekilen;
    }

}
