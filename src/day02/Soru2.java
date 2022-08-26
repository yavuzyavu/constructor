package day02;

import java.util.Scanner;

public class  Soru2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("karenin bir kenarını giriniz");
        int kareninBirKenari= scan.nextInt();
        System.out.println("karenin alanini:" + kareninBirKenari*kareninBirKenari);
        System.out.println("karenin cevresi:" + kareninBirKenari*4);


    }
}
