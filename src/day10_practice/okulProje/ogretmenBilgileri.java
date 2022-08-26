package day10_practice.okulProje;

public class ogretmenBilgileri {
    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    @Override
    public String toString() {
        return "ogretmenBilgileri{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", brans='" + brans + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }




    public ogretmenBilgileri(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;






    }


}
