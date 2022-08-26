package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {
        /* asagidaki multi dimensional array in icarraylerindeki tum elemanlarin toplamini
         birer birer bulan ve herbir sonucu yeni bir array in elamani yapan ve yeni arrayi
         ekrana yazdiran bir program yaziniz
         ornek = {{1,2,3},{4,5},{6,7}}
          */
        int [][] input={{1,2,3},{4,5},{6,7}};
        int [] yeniArr=new int[input.length];
        int sonuc=0;
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                sonuc+=input[i][j];

            }
           yeniArr[i]=sonuc;
            sonuc=0;
        }
        System.out.println("Istenen Yeni Arrays:"+ Arrays.toString(yeniArr));
    }
}
