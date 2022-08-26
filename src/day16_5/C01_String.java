package day16_5;

import java.util.Scanner;

public class C01_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi soyisminizi girin");
        String ilkisim=scan.nextLine(),soyisim= scan.nextLine();
        String sonisim=ilkisim.concat(" "+soyisim).toUpperCase();
        System.out.println(sonisim);
    }
}
