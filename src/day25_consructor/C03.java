package day25_consructor;

public class C03 {
    /*
    proje olustururken bazi classlar run etmek icin degil
    variable ve method olusturup
    .uhlari baska classlardan kullanmak icin olusturulur
     */
    /*
    Default constructor, parametresizdir
    goremesek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    java default constructor i siler
     */
    C03(){

    }
    String isim="Etka";
    public void method1(){
        System.out.println("C03 method calisti");
    }

}
