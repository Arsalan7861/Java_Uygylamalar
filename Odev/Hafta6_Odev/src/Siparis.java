//Siparislerin sinifi.
public class Siparis {
    private int siparisId;
    private String urunAdi;
    private int miktar;
    private double birimFiyati;

    public void setSiparisId(int siparisId) {
        this.siparisId = siparisId;
    }
    public int getSiparisId() {
        return siparisId;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    public String getUrunAdi() {
        return urunAdi;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    public int getMiktar() {
        return miktar;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }
    public double getBirimFiyati() {
        return birimFiyati;
    }

    //Toplam fiyati hesaplayan metod.
    public double toplamFiyat(){
        return miktar * birimFiyati;
    }
}
