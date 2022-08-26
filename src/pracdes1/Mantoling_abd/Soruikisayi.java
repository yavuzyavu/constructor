package pracdes1.Mantoling_abd;

import java.util.Scanner;

public class Soruikisayi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayi girin");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen bir tam sali daha giriniz");
        int sayi2=scan.nextInt();

        if(sayi1>0 && sayi2>0) {
            System.out.println(sayi1 + sayi2);}
        else if (sayi1<0 && sayi2<0){
            System.out.println(sayi1*sayi2);}
         else if((sayi1<0 && sayi2>0 )|| (sayi1>0 && sayi2<0)){
            System.out.println("farkli isaretlerde islem yapamazsin");
        }else{
            System.out.println("sifir yutan eleman");
        }
    }
}
