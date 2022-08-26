package day10_practice.okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
        System.out.println("hosgeldiniz okulumuza");

        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in);

        String isim= scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyIsim=scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans=scan.next();

        scan.nextLine();//dummy hayalet komut

        System.out.println("tel no giriniz");
         String tel=scan.next();

        ogretmenBilgileri adayOgretmen=new ogretmenBilgileri(isim,soyIsim,yas,brans,tel);

        List<ogretmenBilgileri> ogretmenList=new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList"+ogretmenList);
    }
}
