package SirinleCalis;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
​
        Sesli harfler: a,e,i,o,u
​
        Test Data:
        a
​
        Beklenen Çıktı:
        a harfi sesli harfdir.
​
        Test Data:
        d
​
        Beklenen Çıktı:
        d harfi sesiz harftir.
​
        Test Data:
        we  yada %
​
        Beklenen Çıktı:
        Yanlis karakter girdiniz!

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String girilenKarakter = scan.nextLine();
        String sesliHarf = "aeiou";

        if (girilenKarakter.length() > 1) {
            System.out.println("lutfen tek karakter ve harf  giriniz");
        } else if ((girilenKarakter.charAt(0) <= 90 && girilenKarakter.charAt(0) >= 65) || (girilenKarakter.charAt(0) <= 122 && girilenKarakter.charAt(0) >= 97)) {
            if (sesliHarf.contains(girilenKarakter)) {
                System.out.println("girilen harf seslidir");
            } else {
                System.out.println("girilen harf sessizdir");
            }
        } else {
            System.out.println("hatali giris yaptiniz,lutfen harf giriniz");
        }


    }

}
