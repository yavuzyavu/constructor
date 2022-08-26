package day19_scope;

public class C02_StaticVariables {
  static int staticSayi=10;
  String isim= "abdullah";

  static int degersizStaticVar;
  int degersizInstanceVariable;
    public static void main(String[] args) {
/*
bir variable static olusturulduysa objeler icin degil class icin gecerlidir.
 */
      System.out.println(staticSayi);//10
      staticMethod();
      staticSayi=12;
      System.out.println(staticSayi);//12
      C02_StaticVariables obje1= new C02_StaticVariables();
      obje1.staticOlmayanMethod();
      System.out.println(staticSayi);//20
      /*
      instace bir variablenin degerini bulmak icin objenin olusturulmasindan itibaren istenen satira
      kadar kodu takip etmeliyiz

      static variable de ise class in en basindan baslayarak istenen satira kadar kodu takip edip
      static variablenin son degerini bulmamiz gerekir
       */
    }
public static void staticMethod(){

  System.out.println(staticSayi);
    }
  public void staticOlmayanMethod(){
    System.out.println(staticSayi);//12
    staticSayi=20;


    /*
    static variableler class icerisinden her yerden ulasilabilirler
    static olsun veya olmasin tum methodlar static variableleri gorebilir ve degistirebilirler
    farkli methodlarda static variablenin hangi degeri alacagini bilmek istiyorsak classin basindan
    itibaren kodun calismasini takip etmeliyiz
    method ne zaman cagirilirsa o anki static variable degerini method da kullanabiliriz
     */
  }



}
