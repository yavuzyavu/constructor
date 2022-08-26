package calımax;

import java.util.Scanner;

public class CifttekSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi%2==0){
            System.out.println("girilen sayi cift");}
            else{
                System.out.println("girilen sayi tek");
        }
    }
}

