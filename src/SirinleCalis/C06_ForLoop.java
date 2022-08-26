package SirinleCalis;

import java.util.Scanner;

public class C06_ForLoop {
    /*Soru 8 ) Interview Question Kullanicidan bir String isteyin
//          ve Stringi tersine ceviren bir method yazin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime girin");
        String kelime=scan.nextLine();
        String tersKelime="";


        for (int i = 1; i <=kelime.length() ; i++) {
            tersKelime=tersKelime+kelime.charAt(kelime.length()-i);


        }
        System.out.println(tersKelime);

    }

}
