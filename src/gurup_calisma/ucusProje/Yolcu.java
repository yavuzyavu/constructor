package gurup_calisma.ucusProje;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Yolcu {

   private String isimSoyisim;
   private int yas;
   private String sehir;
   private String fyltNo;
   private String kapiNo;
   private String biletTuru;

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getFyltNo() {
        return fyltNo;
    }

    public void setFyltNo() {
        this.fyltNo = ""+ LocalDate.now().getYear()+ LocalTime.now().getHour();
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo() {
        Random rnd=new Random();
        this.kapiNo = sehir+rnd.nextInt(10);
    }

    public String getBiletTuru() {
        return biletTuru;
    }

    public void setBiletTuru(String biletTuru) {
        this.biletTuru = biletTuru;
    }

    public Yolcu(String isimSoyisim, int yas, String sehir, String biletTuru) {
        this.isimSoyisim = isimSoyisim;
        this.yas = yas;
        this.sehir = sehir;
        this.biletTuru = biletTuru;
        setFyltNo();
        setKapiNo();
    }

    @Override
    public String toString() {
        return
                "\nisimSoyisim='" + isimSoyisim +
                "\nyas=" + yas +
                "\nsehir='" + sehir +
                "\nfyltNo='" + fyltNo +
                "\nkapiNo='" + kapiNo +
                "\nbiletTuru='" + biletTuru +
                '}';
    }
}
