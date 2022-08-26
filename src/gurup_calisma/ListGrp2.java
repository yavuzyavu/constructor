package gurup_calisma;

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
        List<String> takim=new ArrayList<>();

        String [] ogrenciler={"Ali","Veli","Ayse","Fatma","Omer"};
        for(String each:ogrenciler){
            if(!each.toLowerCase().contains("a")){
                takim.add(each);
            }
        }

    }
}
