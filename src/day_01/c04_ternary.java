package day_01;

import java.util.Scanner;

public class c04_ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char harf=scan.next().charAt(0);

        String sonuc= (harf>= 'a' &&  harf<= 'z') ? ("kucuk harf"):
                (harf>= 'A' && harf <= 'Z') ? "buyuk harf" : "gecersiz karakter";

        System.out.println(sonuc);

    }
}
