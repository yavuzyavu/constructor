package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        arrayi array yapan sembol[] idi
        arrayList de ise <> diamand(elmas) kullaniriz
        */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);//[]

        // bir Liste eleman eklemek istersek
        isimler.add("ali");
        System.out.println(isimler.add("veli"));// true doner
        System.out.println(isimler.add("Ayse"));
        /*
        string te bir method calistirdigimizda
        assign yapmazsak String degismiyordu

        String isim="Suleyman"
        isim.toUpperCase(); //SULEYMAN
        sout(isim) --> Suleyman
         */

        System.out.println(isimler);//[ali,veli]
    /*
    Listin en kotU tarafi;Array alt yapisini kullandigi icin
    elamanlari teker teker eklemek zorunda olmamizdir
     */




    }
}
