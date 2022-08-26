package day8_pratice;

import java.util.ArrayList;
import java.util.List;

public class C03 {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int [] sayi={1,2,3,4,5,6,7,8};

        int n=4;

        List<Integer> list= new ArrayList<>();
        for(int each:sayi){
            list.add(each);
        }
        List<Integer> maxList= new ArrayList<>();
        int count=1;
        while (count<=n){
            int max =list.get(0);
            for (int i = 0; i <list.size() ; i++) {

            }
        }
    }
}
