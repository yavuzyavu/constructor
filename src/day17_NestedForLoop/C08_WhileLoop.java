package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /* kullanicidan toplamak uzere sayi alin sayilarin toplami 500 u gecince sayilarin toplami
        ni ve kac sayi toplandigini su sekilde yazdirin.

        13 sayi girdiniz ve toplamlari 567
         */
    int toplam=0;
    int sayi=0;
    int sayac=0;
        Scanner scan =new Scanner(System.in);
        while(toplam<500){
            System.out.println("Lutfen toplamak icin sayi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println(sayac+" sayi girdiniz ve toplamlari:"+toplam);

    }
}
