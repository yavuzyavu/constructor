package pracdes1.Mantoling_abd;

import java.util.Scanner;

public class soruDortBsmk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dort basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi%5==0 && sayi%10==0){
            System.out.println("5 e bolunen cift sayi");
        }
else if( sayi%5==0 && sayi%10!=0){
            System.out.println("5 e bolunen tek sayi");
        }else {
            System.out.println("tekrar deneyin");
        }



        }
        }


