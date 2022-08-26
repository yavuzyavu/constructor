package bodycalısma;

import java.util.Locale;
import java.util.Scanner;

public class Ucisim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen 3 kelimeden olusar isminizi giriniz");
        String isim=scan.nextLine();
        int x=isim.indexOf(" ");
        int x1=isim.lastIndexOf(" ");

        String sonc=isim.substring(0,1).toUpperCase()+"."+isim.substring
                (x,x+2).toUpperCase().trim()+"."+isim.substring(x1,x1+2).trim().toUpperCase()+".";
        System.out.println(sonc);
    }
}
