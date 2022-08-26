package day_12;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen Y/N ikilisinden birini giriniz:");
        char harf= scanner.next().charAt(0);
        if(harf=='Y'|| harf== 'y'){
            System.out.println("YES");}
            else if(harf =='N'|| harf=='n'){
            System.out.println("NO");
        }
            else System.out.println("yanlis giris yaptiniz, lutfen sadece Y/N gir");

        }

    }

