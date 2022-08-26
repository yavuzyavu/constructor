package day33_encapsulation;

public class Ogretmen {
    private String isim;
    private String soyIsim;
    private String brans; /*
      Bazen de yetkileri sinirlamak degil de
      yapilan isi daha iyi tanimlamak icin
      encapsulation kullanilir
      Bu yaklasimi kullanan class'larda
      tum variable'lar private yapilip
      hepsi icin getter ve setter olusturulur
     */
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyIsim() {
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
    public String getBrans() {
        return brans;
    }
    public void setBrans(String brans) {
        this.brans = brans;
    }
}
