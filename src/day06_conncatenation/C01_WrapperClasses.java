package day06_conncatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str ="Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());

 String ogrNo="123456";
 // kullanicidan bir sifre isteyin. eğer sifre sadece rakamlardan olusuyorsa kabul etmeyin.
        Scanner scan= new Scanner(System.in);
        String sifre1;
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");
 String sifre = scan.nextLine();
        Integer sifresayi= Integer.parseInt(sifre);
        System.out.println("girilen sifre:"+sifre);
        System.out.println("girilen sifre:"+sifresayi);

    }
}
