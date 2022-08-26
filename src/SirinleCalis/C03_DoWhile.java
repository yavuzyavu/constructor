package SirinleCalis;

import java.util.Scanner;

public class C03_DoWhile {
    public static void main(String[] args) {
        /*
 kullanicidan tamsayilar alin
    kullanici cift sayi girdigi muddetce sayilari yazdirin
    tek sayi girdiginde islemi bitirin.
     */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        do {
            System.out.println("Lutfen bir cift sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
            }else{
                System.out.println("tek sayi girdiniz");
            }
            }while(sayi%2==0);
        System.out.println("tek sayi girdiginiz icin islem bitti");
        }


    }






