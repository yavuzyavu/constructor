package SirinleCalis.Sirin_0207;

import java.util.Scanner;

public class degeralaMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String kelime=scan.nextLine();
        String  kelime1=scan.nextLine();
        birlestirKelime(kelime,kelime1);
        System.out.println(birlestirKelime(kelime,kelime1));
        ilkHarfsiz(kelime,kelime1);






    }

    public static String birlestirKelime(String kelime, String kelime1) {

        return kelime+kelime1;

    }

    public static void ilkHarfsiz(String kelime, String kelime1)
    {
        String sonuc=kelime.substring(1)+kelime1.substring(1);
        System.out.println("sonuc = " + sonuc);
    }
}
