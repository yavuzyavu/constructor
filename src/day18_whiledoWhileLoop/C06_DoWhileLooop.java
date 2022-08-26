package day18_whiledoWhileLoop;

import java.util.Scanner;

public interface C06_DoWhileLooop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pztsyad=0;
        int negsyad=0;
        int pztsytop=0;

        do {
            System.out.println("lutfen toplamak uzere pozitif sayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pztsytop+=sayi;
                pztsyad++;
            }else if (sayi<0){
                negsyad++;
                System.out.println("negatif sayi giremezsiniz");




            }
        }while (sayi!=0);
        System.out.println(pztsyad+"adet pozitif sayi girdiniz,toplamlari:"+pztsytop);
        System.out.println(negsyad+"adet negatif sayi girdiniz ancak toplama dahil edilmedi");
    }
}
