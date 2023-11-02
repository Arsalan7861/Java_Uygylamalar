public class Main {
    public static void main(String[] args){
        Musteri musteri1 = new Musteri();//Ilk musteri nesnesi olusturmak.
        Musteri musteri2 = new Musteri();//ikinici musteri nesnesi olusturmak.

        Siparis siparis1 = new Siparis();//1. musterinin ilk siparisi icin nesne olusturmak
        Siparis siparis2 = new Siparis();//2. musterinin ilk siparisi icin nesne olusturmak

        //1. musteriye set metodu ile ifade atamak.
        musteri1.setAd("Arsalan");
        musteri1.setSoyAd("Amir");
        musteri1.setEmail("arsalan@gmail.com");
        musteri1.setTelefon("05435674567");
        //2. musteriye set metodu ila ifade atamak.
        musteri2.setAd("Ahmet");
        musteri2.setSoyAd("Ali");
        musteri2.setEmail("ahmet@gmail.com");
        musteri2.setTelefon("054386574767");
        //1. musterinin 1. siparisin bilgilerini set metodu ile atamak.
        siparis1.setSiparisId(342);
        siparis1.setUrunAdi("Bilgisayar");
        siparis1.setMiktar(1);
        siparis1.setBirimFiyati(12999.9);
        //2. musterinin 1. siparisin bilgilerini set metodu ile atamak.
        siparis2.setSiparisId(343);
        siparis2.setUrunAdi("Telefon");
        siparis2.setMiktar(1);
        siparis2.setBirimFiyati(4999.9);

        //Musterilein bilgilerini get metodu ile ekrana yazdirmak.
        System.out.println("1. Musterinin bilgileri");
        System.out.println("Ad : " + musteri1.getAd());
        System.out.println("Soyad : " + musteri1.getSoyAd());
        System.out.println("Email : " + musteri1.getEmail());
        System.out.println("Telefon Numarasi : " + musteri1.getTelefon());
        System.out.println("\n2. Musterinin bilgileri");
        System.out.println("Ad : " + musteri2.getAd());
        System.out.println("Soyad : " + musteri2.getSoyAd());
        System.out.println("Email : " + musteri2.getEmail());
        System.out.println("Telefon Numarasi : " + musteri2.getTelefon());
        //Musterilerin siparislerini ekrana yazdirmak.
        System.out.println("\n1. musterinin ilk siparisin detaylari :");
        System.out.println("Siparis ID : " + siparis1.getSiparisId());
        System.out.println("Urun Adi : " + siparis1.getUrunAdi());
        System.out.println("Miktar : " + siparis1.getMiktar());
        System.out.println("Fiyat : " + siparis1.getBirimFiyati());
        System.out.println("\n2. musterinin ilk siparisin detaylari :");
        System.out.println("Siparis ID : " + siparis2.getSiparisId());
        System.out.println("Urun Adi : " + siparis2.getUrunAdi());
        System.out.println("Miktar : " + siparis2.getMiktar());
        System.out.println("Fiyat : " + siparis2.getBirimFiyati());

        //Siparislerin toplam fiyatini siparis sinifindaki toplamFiyat metodu ile ekrana yazdirmak.
        System.out.println("\n1. musterinin siparislerinin toplam fiyati = " + siparis1.toplamFiyat());
        System.out.println("2. musterinin siparislerinin toplam fiyati = " + siparis2.toplamFiyat());
    }
}
