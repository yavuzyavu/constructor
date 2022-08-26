package day42_AbstractClass_Intarface;

public interface I03_Interfaces {

    int SAYI=20;

    /* int sayi;


     */

    void yakit();
    /*
    Interface icirisindeki her method public ve abstract ozelliklerine sahiptir
    abstract bir methodun body si olmasi mumkun degildir
    java sonradan developerlarin istegi uzerine kismi bir apdete yapmistir bir interfaceye
    bir abstract method eklerseniz o interfaceyi implement etmis tum claslara gidip hepsinde
    yeni eklenen methodu override etmeniz gerekir
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir

    bunun icin java Java8'den itibaren
    interfacelere sonradan  
     */

    public void motor();
    public abstract void teker();


}
