package SirinleCalis.t;

public class EsitMi {
    public static void main(String[] args) {
        /*
 İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
    num1 = num2 => true

         */

        int sayi=15;
        int sayi1=15;

        System.out.println(esitMi(sayi, sayi1));


    }

    public static boolean esitMi(int sayi, int sayi1) {

        boolean a=sayi==sayi1;

        return a;
    }
}
