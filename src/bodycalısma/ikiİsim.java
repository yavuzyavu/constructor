package bodycalısma;

import java.util.Scanner;

public class ikiİsim {
    public static void main(String[] args) {
       /* Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
                ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        */
       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi giriniz");
        String isim=scan.nextLine();
        int x=isim.indexOf(" ");
        String sonuc=isim.substring(0,x)+"\n"+isim.substring(x).trim();
        System.out.println(sonuc);

        */
        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.println(j);

            }

            System.out.println();

        }
    }
}
