package day02;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("dikdörtgenler pirizmasinin kenarlarini ve yüksekligini giriniz" );
int a= scan.nextInt();

int b= scan.nextInt();
int h= scan.nextInt();
int hacim=a*b*h/3;
        System.out.println("pirizmanin hacmi: "+hacim );



    }
}
