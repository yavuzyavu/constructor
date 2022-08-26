package day_09;

import java.util.Scanner;

public class C01_tarnary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ?sayi : (-1*sayi));

    }
}
