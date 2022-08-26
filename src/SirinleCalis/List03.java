package SirinleCalis;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
         /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

 */
        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        List<String> liste = new ArrayList<>();

        yeniListeYap(liste, arr);
        System.out.println("liste = " + liste);
        Collections.sort(liste);
        System.out.println("liste = " + liste);

    }

    private static List yeniListeYap(List<String> liste, String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                liste.add(arr[i][j]);


            }

        }




        return liste;

    }

}