package day_12;

import java.util.Scanner;

public class c09 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int vize1;
        int vize2;
        int finalNo;

        System.out.println("vize1:");
        vize1=scan.nextInt();
        System.out.println("vize2");
        vize2=scan.nextInt();
        System.out.println("finalno");
        finalNo=scan.nextInt();
        double sonuc= ((vize1+vize2/2)*0.3 +99*0.7);
        System.out.println(sonuc);
    }
}
