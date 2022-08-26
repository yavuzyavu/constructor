package day15_overloading_forLoop;

public class C03_overloading {
    public static void main(String[] args) {
        topla(5,7);//12
        topla(5.6,6);
        topla(5.7,9.9);
        topla(7,7.6);


    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integer in toplami:" + (sayi1 + sayi2));
    }

   /*bir class ta parametre sayisi ve parametre data turleri ayni olan 2 method OLUSTURAMAYIZ.
    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integer in toplami:" + (sayi3 + sayi4));
   */
   public static void topla(int sayi1, double sayi2) {
       System.out.println("bir integer bir double in toplami:" + (sayi1 + sayi2));}

       public static void topla(double sayi1, int sayi2) {
           System.out.println("bir double bir integer in toplami:" + (sayi1 + sayi2));}

           public static void topla(double sayi1, double sayi2) {
               System.out.println("iki doublenin toplami:" + (sayi1 + sayi2));}




}



