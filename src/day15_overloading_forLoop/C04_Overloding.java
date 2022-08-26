package day15_overloading_forLoop;

public class C04_Overloding {
    public static void main(String[] args) {
        topla(5,7);//12
        topla(5.6,6);
        topla(5.7,9.9);
        topla(7,7.6);

        /*
        Java hangi methodun calisacagına karar verirken optimizasyon yapar.
        - eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir.
        - eger cast yapmadan kullanabilecegi bir method yoksa,
        en az kast yaparak kullanabilecegi methodu tercih eder.
         */


    }

    public static void topla(int sayi1, int sayi2) {
        System.out.
                println("iki integer in toplami:" + (sayi1 + sayi2));
    }
    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double bir integer in toplami:" + (sayi1 + sayi2));}

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki doublenin toplami:" + (sayi1 + sayi2));}
    public static void topla(int sayi1, int sayi2,int sayi3) {
        System.out.
                println("uc integer in toplami:" + (sayi1 + sayi2+sayi3));
    }




}


