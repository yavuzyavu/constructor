package day02;

import java.util.Locale;
import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adını giriniz");
/* java clasında nextChar metodu yoktur

 */

      char ilkharf = scan.next().toLowerCase().charAt(1);
        System.out.println("ismin ilk harfi:"+ ilkharf);
    }
}
