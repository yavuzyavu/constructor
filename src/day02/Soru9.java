package day02;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi soyisminizi ve yasinizi giriniz \naralarda enter tusuna basiniz ");
        String isim= scan.nextLine();
        String soyisim=scan.nextLine();
        int yas= scan.nextInt();
        System.out.println("Girilen Bilgiler=" + isim+ " " + soyisim + " " + yas);
    }
}
