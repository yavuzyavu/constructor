package SirinleCalis.t;

import java.util.Arrays;

public class Fark {
    public static void main(String[] args) {
        /*
          38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
​
    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
         */
        
        int [] sayi= {10, 15, 20, 2, 10, 6};

        Arrays.sort(sayi);

        System.out.println(farkbul(sayi));
        System.out.println(Arrays.toString(sayi));

    }

    public static int farkbul(int[] sayi) {

        int fark=sayi[sayi.length-1]-sayi[0];

        return fark;
    }
}
