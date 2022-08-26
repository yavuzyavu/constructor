package bodycalısma;

import java.util.Scanner;

public class MusteriKart {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen urun adedini girin");
        int adet=scan.nextInt();
        System.out.println("lutfen liste fiyatini girin");
        double fiyat=scan.nextDouble();
        System.out.println("musteri kartinizin olup olmadigini belirtiniz");
         boolean kart=scan.nextBoolean();
        if( kart==true){
           if(adet>10){
               System.out.println(fiyat*adet*80/100);
            } else{
               System.out.println(fiyat*adet*85/100);
           }
         }else if(kart==false){
            if(adet>10){
                System.out.println(fiyat*adet*85/100);
            } else{
                System.out.println(fiyat*adet*90/100);
        }

    }
}}
