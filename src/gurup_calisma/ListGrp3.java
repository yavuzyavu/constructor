package gurup_calisma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListGrp3 {
    public static void main(String[] args) {
         /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

          */
        String [][] cocuklar={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        List<String> sırala=new ArrayList<>();

        yeniList1(cocuklar,sırala);
        System.out.println("sırala = " + sırala);
        Collections.sort(sırala);
        System.out.println("sırala = " + sırala);

    }

    private static List yeniList1(String[][] cocuklar, List<String> sırala) {

        for (int i = 0; i <cocuklar.length ; i++) {
            for (int j = 0; j <cocuklar[i].length ; j++) {
                sırala.add(cocuklar[i][j]);


            }

        }
        return sırala;
    }
}
