package day04_pratice;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("metre ve kilometreya donusturmek istediginiz cm degeri giriniz");
        double santiMeterValue= scan.nextDouble();
        convertSM(santiMeterValue);
    }

    private static void convertSM(double santiMeterValue) {
        double meter=santiMeterValue/100;
        double kMeter=santiMeterValue/100000;
        System.out.println("girdiginiz cm degeri:"+santiMeterValue);

    }
}
