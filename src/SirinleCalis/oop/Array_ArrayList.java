package SirinleCalis.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_ArrayList {

    public static void main(String[] args) {
        String [] pazarSepeti = new String[5];
        String [] pazarSepeti2={"elma","patates", "kivi" ,"karpuz" , "muz"};
        //arrayin eleman sayilari ile oynayamayiz
        //ne arttirabiliriz ne azaltabiliriz

        List<String> listPazarSepeti=new ArrayList<>();
        listPazarSepeti.add("elma");
        listPazarSepeti.add("patates");
        listPazarSepeti.remove("patates");

        List<String> listPazarSepeti2=Arrays.asList(pazarSepeti2);
        System.out.println(listPazarSepeti2.size());
        listPazarSepeti.add(0,"cikolata");

        listPazarSepeti2.set(0,"pasta");

        System.out.println(listPazarSepeti2.get(0));

       if (!listPazarSepeti2.contains("ketcap")) {
           listPazarSepeti2.add("ketcap");
           //System.out.println(listPazarSepeti2);

       }


    }





}
