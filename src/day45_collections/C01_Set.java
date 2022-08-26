package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {


        //Verilen bir array'deki tekrar eden elmentleri silip tekrarsiz halini
        //array'e atayan kod yaziniz

        int [] arr={4,5,3,6,8,7,5,1,9,0,5,4,3,2,4,5,6,3,1,0};
        Set<Integer> tekrarsizSet=new HashSet<>();

        for(int each:arr){

            tekrarsizSet.add(each);
        }
        System.out.println("Set: "+tekrarsizSet);

        int [] tekrarsizArr=new int[tekrarsizSet.size()];

       //System.out.println(Arrays.toString(tekrarsizArr));
        int i=0;
        for(Integer each:tekrarsizSet){
            tekrarsizArr[i]=each;
            i++;
        }
        arr=tekrarsizArr;
        System.out.println("Bizim array'in son hali "+ Arrays.toString(arr));


    }
}
