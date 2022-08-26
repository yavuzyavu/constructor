package day33_encapsulation;

public class Araba {


    String marka = "marka belirtilmedi";//markanin acses modifier i default access modi
                                        //fir oldugundan package icinde kullanilabilir
    private String model = "model belirtilmedi";
    private String yakıt = "yakit belirtilmedi";// tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakıt() {
        return yakıt;
    }
}
