package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
// C05 deki methodu kullanarak array e eleman ekleyelim
        String[] takimListesi= {"ali", "veli"};
        String eklenecekIsim="can";
        takimListesi=C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}
