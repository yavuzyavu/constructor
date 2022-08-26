package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListItarator {

    public static void main(String[] args) {

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);

        liste.add(14);
        liste.add(40);

        ListIterator li1=liste.listIterator();
        System.out.println(liste);

        while (li1.hasNext()){

            li1.next();
        }

        while (li1.hasPrevious()){
            System.out.println(li1.previous()+" ");
        }

    }
}
