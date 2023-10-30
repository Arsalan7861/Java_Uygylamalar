public class Dikdortgen extends GeometrikSekil{
    public int uzunluk;
    public int genislik;

    Dikdortgen(int uzunluk, int genislik){
        super(uzunluk * genislik);//Dikdortgenin alanini hesaplayip GeometrikSekil sinifina aktar.
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }
}
