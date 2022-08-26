package day_2806;

import java.util.Scanner;

public class C01_Scaner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayisini yaziniz");
        a= scan.nextDouble();
        System.out.println("b sayisini yaziniz");
        b= scan.nextDouble();
        System.out.println("c sayisini yaziniz");
        c= scan.nextDouble();

        double sonuc=((a*a)-(b*b))/(c*3);
        System.out.println("sonuc = " + sonuc);
    }
}
