package day02;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen yaşinizi giriniz");
        double yas= scan.nextDouble();
        System.out.println("Girilen Bilgiler= :" + isim +" "+ soyisim +" "+ yas);
    }
}
