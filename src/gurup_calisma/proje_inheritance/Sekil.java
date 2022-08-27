package gurup_calisma.proje_inheritance;

public class Sekil {
    double uKenar;
    double kKenar;
    double yariCap;

    public Sekil(double uKenar, double kKenar) {
        this.uKenar = uKenar;
        this.kKenar = kKenar;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public double alanHesaplama(){
         return kKenar*uKenar;
    }
    public double cevreHesaplama(){

        return (kKenar+uKenar)*2;
    }

    public double cemberAlanHesaplama(){

        return yariCap*yariCap*Math.PI;
    }

    public double cemberCevreHesaplama(){

        return yariCap*2*Math.PI;
    }
}
