package day18_whiledoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        int sayi=0;
        Scanner scan=new Scanner(System.in);

        while (sayi%2==0); {
            System.out.println("Lutfen bir tam sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0){
            System.out.println("girilen sayi cift:" +sayi);}
            else{
                System.out.println("girilen sayi tek ");
            }
        }

        do {System.out.println("Lutfen bir tam sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0){
                System.out.println("girilen sayi cift:" +sayi);}
            else{
                System.out.println("girilen sayi tek ");
            }

        }while (sayi%2==0);
    }
}
