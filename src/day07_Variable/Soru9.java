package day07_Variable;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lütfen soyadinizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("lütfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println(isim+" "+soyisim+" "+ yas);
    }
}
