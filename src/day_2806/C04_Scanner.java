package day_2806;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi ve kilonuzu giriniz");
        int yas= scan.nextInt();
        int kilo=scan.nextInt();

        if(yas>0&&yas<18) {
            System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
        }else if(yas>=18 ){
            if (kilo>0&&kilo<50) {
                System.out.println("kilonuz 50den kucuk");

            }
        else   {
                System.out.println("bagıs yap");







    }
}}}
