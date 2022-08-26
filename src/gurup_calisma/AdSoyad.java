package gurup_calisma;
/*Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        ad ayrı soyad ayrı sekilde ekrana yazdırınız.
 */

import java.util.Scanner;

public class AdSoyad {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isimSyism=scan.nextLine();
        int x=isimSyism.indexOf(" ");
        String sonuc=isimSyism.substring(0,x)+"\n"+isimSyism.substring(x).trim();
        System.out.println(sonuc);

    }
}

