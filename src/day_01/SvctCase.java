package day_01;

import java.util.Scanner;

public class SvctCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int günNo=scan.nextInt();

        switch (günNo) {

            case 1:
                System.out.println("pazartesi");
                break;

            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:

                System.out.println("persembe");
                break;
            case 5:

                System.out.println("cuma");
                break;
            case 6:

                System.out.println("cumartesi");
                break;
            case 7:

                System.out.println("pazar");
                break;
            default:
                System.out.println("lutfen gecerli bir sayi giriniz");



    }
}}
