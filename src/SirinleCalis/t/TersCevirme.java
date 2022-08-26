package SirinleCalis.t;

import java.util.Arrays;

public class TersCevirme {
    public static void main(String[] args) {

                /*Bir arrayi tersine çeviren  method yazınız.
​
        Test Data:
​
        reverse [1, 2, 3, 4]
        return  [4, 3, 2, 1]

                 */

        int[] sayilar = {1, 2, 3, 4};
        int ters[] = new int[sayilar.length];

        tersCevir(sayilar,ters);
        System.out.println(Arrays.toString(ters));
    }

    public static int[] tersCevir(int[] sayilar,int[] ters) {


        for (int i = sayilar.length - 1; i >= 0; i--) {

            ters[sayilar.length - i - 1] = sayilar[i];
        }


        return ters;
    }
}

