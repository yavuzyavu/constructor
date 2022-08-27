package gurup_calisma.proje_inheritance;

public class dikdortgen extends Sekil{

    public dikdortgen(double uKenar, double kKenar) {
        super(uKenar, kKenar);
    }
    public double alanHesaplama(){

        System.out.println("diikdortgendeki method");
        return kKenar*uKenar;
    }
    public double cevreHesaplama(){
        System.out.println("diikdortgendeki method");

        return (kKenar+uKenar)*2;
    }
}
