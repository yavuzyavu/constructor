package SirinleCalis;

import java.util.Scanner;

public class C04_doWhile {
    public static void main(String[] args) {
        /*kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0`a basmasini soyleyin.
          kullanici yanlislikla negatif sayi girerse, o sayiyi dikkate almayin ve "Negatif sayi giremezsiniz"
          yazdirip, basa donun.
          kullanici 0`a bastiginda toplam kac pozitif sayi girdigini
            ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAd=0;
        int pozSayTp=0;
        int negSayiAd=0;

        do{
            System.out.println("lutfen toplamak uzere pozitif tam sasyi giriniz");
            sayi=scan.nextInt();

            if(sayi>0){
                pozSayTp+=sayi ;
                pozSayiAd++;
            }else if(sayi<0){
                negSayiAd++;
                System.out.println("negatif sayi girdiniz");

            }

        }while (sayi!=0);

        System.out.println(pozSayiAd+" adet pozitif tam sayi girdiniz "+"toplamlari " + pozSayTp);
        System.out.println(negSayiAd +" adet negatif sayi girdiniz " +"ancak bu sayi " +
                "toplama eklenmedi");
    }
}
