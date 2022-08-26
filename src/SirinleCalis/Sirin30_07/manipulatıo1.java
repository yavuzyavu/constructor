package SirinleCalis.Sirin30_07;

import SirinleCalis.Sirin_0207.degeralaMethod;

public class manipulatıo1 {
    public static void main(String[] args) {
        String isim= "Abudllah.";
        boolean ilkKarekter= isim.charAt(0)>='A' && isim.charAt(0)<='Z';
        boolean sonKarekter= isim.charAt(isim.length()-1)=='.' ;
         boolean sonuc= ilkKarekter && sonKarekter;
        System.out.println("sonuc : "+ sonuc);
        System.out.println(degeralaMethod.birlestirKelime("elma","armut"));






    }

}
