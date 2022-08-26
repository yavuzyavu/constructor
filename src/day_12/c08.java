package day_12;

import java.util.Scanner;

public class c08 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("kg olarak agirlinizi giriniz");
        double kilo=scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();
        boy/=100;
        double vkı= kilo/(boy*boy);
        System.out.println("vkı="+vkı);

    }
}
