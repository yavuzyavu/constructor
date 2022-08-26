package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search javada eleman aramanin kisa yoludur
        ancak binary search calismasi icin once array in sirali hale getirilmesi gerekir
        eger siralama yapmadan binarySearch yaparsaniz sonucu bulamayabilir veya yanlis bulabilir.
         */
            String [] harfler= {"Y","B","D","G","O","A"};
            String arananHarf="Y";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));
        //binarySearch bize aradigimiz elemanin index ini dondurur
        // array sirali olmadigi icin arama sonucu dogru bulmayabilir
        //emin olmak icin once short yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }
}
