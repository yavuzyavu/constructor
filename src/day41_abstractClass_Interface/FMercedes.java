package day41_abstractClass_Interface;

public class FMercedes extends DAraba{

    @Override
    public void yakit() {
        /*
          abstract bir parent'in concrete child class inherit ederse
          parent abstract class'daki tum abstract method'lari
          override etmek zorundadir
          abstract bir class, abstract baska bir class'i parent edinirse
          parent class'daki tum abstract method'lari override etmek
          ZORUNDA DEGILDIR (Cunki toyota classi abstrract Mercedes classi abstract degil
          bundan dolayi tum abstract methodlarri cagirdik)
       */


    }

    @Override
    public void kaporta() {

    }

    @Override
    public void motor() {

    }
}
