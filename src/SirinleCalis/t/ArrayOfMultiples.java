package SirinleCalis.t;

import java.util.Arrays;

public class ArrayOfMultiples {
    public static void main(String[] args) {

        /*
        35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.
​
    Test Data:
    arrayOfMultiples(7, 5)
​
    sonuç: [7,14,21,28,35]
​
         */

      int sayi= 7;
      int sayi1=5;

      arrayinKatlari(sayi,sayi1);
      arrayinKatlari(4,9);



    }

    public static void arrayinKatlari(int sayi, int sayi1) {

        int arr []= new int [sayi1];

        for (int i = 1; i <=sayi1 ; i++) {

            arr[i-1]= sayi*i;



        }

        System.out.println(Arrays.toString(arr));
    }

}
