package SirinleCalis;

import java.util.ArrayList;
import java.util.List;

public class ListGrp2 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        List<String>  takim=new ArrayList<>();

        String [] ogrenciler={"Ali","Veli","Ayse","Fatma","Omer","Cemil"};

        for (int i = 0; i <ogrenciler.length ; i++) {
            if(!ogrenciler[i].toLowerCase().contains("a")){
                takim.add(ogrenciler[i]);

            }

        }
        System.out.println(takim);


        for(String w:ogrenciler){
            if(!(w.toLowerCase().contains("a"))){
            takim.add(w);}
        }
        System.out.println(takim);


    }
}




                

            


        

