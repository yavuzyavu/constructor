package SirinleCalis.t;

import java.util.Scanner;

public class ArananKelime {
    public static void main(String[] args) {

        /*10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
        Test Data:
        Java is easy
        Aranan String: is
        Bektenen Çıktı:
        True
        Aranan String: and
        Beklenen Çıktı:False

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lutfen aradiginiz kelimeyi giriniz");
        String kelime = scan.next();

         /*   if(cumle.contains(kelime)){
                System.out.println("true");
            }else{
                System.out.println("false");
          */

        boolean varMi = cumle.contains(kelime);
        System.out.println("varMi = " + varMi);
    }

}



