package SirinleCalis.constructor;

public class Cty {
    String sehirIsmi;
    int sehirNufus;
    int ilceSayisi;
    String meshurYemegi;
    boolean sahilSehriMi;
    String  futbolTakimi;

    public Cty(String sehirIsmi, int sehirNufus, int ilceSayisi, String meshurYemegi,
               boolean sahilSehriMi, String futbolTakimi) {
        this. sehirIsmi=sehirIsmi;
        this.sehirNufus = sehirNufus;
        this.ilceSayisi = ilceSayisi;
        this.meshurYemegi = meshurYemegi;
        this.sahilSehriMi = sahilSehriMi;
        this.futbolTakimi = futbolTakimi;
    }

    public Cty(String sehirIsmi, int sehirNufus) {
       this. sehirIsmi ="tokat";
        this.sehirNufus = sehirNufus;
    }

    public Cty(){

    }

}

