package day07_Variable;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //insanlaın dünyasından kodlarımızın bulunduğu claassa değer almak için sccnnar clac kullanırız
        // 1- scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

       String kullaniciIsmi= scan.next();

        System.out.println("Isminiz:" + kullaniciIsmi);

    }
}
