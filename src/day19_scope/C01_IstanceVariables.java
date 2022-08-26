package day19_scope;

public class C01_IstanceVariables {
    int instSayi=20; // static olmayip class

    public static void main(String[] args) {
        int sayi=10;
      /*  System.out.println(instSayi);
   instance variables static olmadigi icin static


      */

        C01_IstanceVariables obje1= new C01_IstanceVariables();
        System.out.println("obje1 degismeden once:" +obje1.instSayi);
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra:" +obje1.instSayi);
        C01_IstanceVariables obje2= new C01_IstanceVariables();
        System.out.println("obje2 degismeden once:" +obje2.instSayi);
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra:" +obje2.instSayi);
        C01_IstanceVariables obje3= new C01_IstanceVariables();
        System.out.println("obje3 degismeden once:" +obje3.instSayi);
        /*
        her obje olustugunda instance(obje) variablenin  ilk atanan degerini alir.
         */
    }



    public static void staticMethod(){
        // System.out.println(sayi);
        /*bir methodun icerisinde olusturulan variable,
        sadece o methodun icinde kullanilir.
        instance variable lara main method disindaki static methodlardan da direk ulasamayiz.
        obje olusturursak ulasabiliriz
         */
        C01_IstanceVariables obje4= new C01_IstanceVariables();
        System.out.println(obje4.instSayi);


    }
public void staticOlmayanMethod(){
    System.out.println(instSayi);
    /*
    instance variable lar class icerisindeki static olmayan methodlardan direk kullanilabilir
     */
}

}


