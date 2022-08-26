package gurup_calisma.gurupProje;

import java.util.Locale;

public class Book {

    private String kitapAdi;
    private String yazarAdi;
    private int kitapFiyati;
    private int kitapId;

    public Book(String kitapAdi, String yazarAdi, int kitapFiyati, int kitapId) {
       // this.kitapAdi = kitapAdi;
        setKitapAdi(kitapAdi);
       // this.yazarAdi = yazarAdi;
        setYazarAdi(yazarAdi);
        //this.kitapFiyati = kitapFiyati;
        setKitapFiyati(kitapFiyati);
        this.kitapId = kitapId;

    }
    public Book (){

    }


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi ="***"+ kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi =yazarAdi.toUpperCase();
    }

    public int getKitapFiyati() {
        return kitapFiyati;

    }

    public void setKitapFiyati(int kitapFiyati) {
        this.kitapFiyati = kitapFiyati*18;
    }

    public int getKitapId() {
        return kitapId;
    }

    public void setKitapId(int kitapId) {
        this.kitapId = kitapId;
    }
}
