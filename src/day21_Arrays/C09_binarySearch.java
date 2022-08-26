package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
       binarySearch methodu siralanmis arrayde aradigimiz elementin index ini dondurur
       ya aradigimiz element array de yoksa?
       (string de indexof() bize olmayan elementler icin -1 donduruyordu)
         */
        int [] sayilar={3,5,6,7,8,9,0};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        // varsa indrex yoksa -sira

        System.out.println(Arrays.binarySearch(sayilar,5));//2
        System.out.println(Arrays.binarySearch(sayilar,10));//-8
        System.out.println(Arrays.binarySearch(sayilar,2));//-2
        System.out.println(Arrays.binarySearch(sayilar,4));//-4
        System.out.println(Arrays.binarySearch(sayilar,1));//-2


    }
}
