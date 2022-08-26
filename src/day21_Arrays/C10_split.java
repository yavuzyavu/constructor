package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() bir array methodu degil , String methodu dur
        ama array dondurdugu icin bu konuda anlatıyoruz

            split() ile herhangi bir Stringi istedigimiz sekilde parcalara bolup bir array haline
            getiriyoruz.

         */
        String str="Java ne kadar guzel";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
