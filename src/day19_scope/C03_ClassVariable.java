package day19_scope;

public class C03_ClassVariable {
    public static void main(String[] args) {
        /*
        farkli bir class da calisirken her hangi bir class adini yazip .'ya basarsak
        adini yazdigimiz class taki tum STATIC class uyelerini gorebilir ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0

        /*
     Class level variable lere deger atayip atamamak bize kalmistir.
     eger deger atamissak java atadigimiz o degeri kabul eder
     deger atamaz isek java bu variablelere default bir deger atamasi yapar.
    int---0
    String ----null
    boolean----false
    char----'' hiclik
     */

/*
baska class taki instance variablelara obje olusturarak ulasabiliriz
 */

  C02_StaticVariables obje1=new C02_StaticVariables();
  obje1.staticOlmayanMethod();//10
        //bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); //abdullah
        System.out.println(obje1.degersizInstanceVariable);//0

        System.out.println(C02_StaticVariables.staticSayi);//20
        /*
        farkli bir class tan C02 clasindan method ve variableleri kullandigimda C02 clasinin tamami degil s
        sadece benim cagırdigim clas uyeleri calisir
         */




    }
}
