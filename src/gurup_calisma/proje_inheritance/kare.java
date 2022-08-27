package gurup_calisma.proje_inheritance;

public class kare extends dikdortgen{
    public kare(double uKenar, double kKenar) {
        super(uKenar, kKenar);
    }

    @Override
    public String toString() {
        return "karenin alani"+alanHesaplama()+"cevresi"+cevreHesaplama();
    }
    
}
