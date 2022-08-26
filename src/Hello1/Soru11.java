package Hello1;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        String str= "Java ıle hayat ne guzel";
        System.out.println(str.toUpperCase());
        Boolean güzelMi= true;
        güzelMi.toString();

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        String ogrNo="123456";
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 basamakli bir sayi giriniz ");
        String sifre=scan.nextLine();
        Integer sifreSayi= Integer.parseInt(sifre);


        System.out.println("girilen sifre 3 fazlasi : " + (sifre+3));
        System.out.println("Integer sifre 3 fazlasi : " + (sifreSayi+3));








    }
}
