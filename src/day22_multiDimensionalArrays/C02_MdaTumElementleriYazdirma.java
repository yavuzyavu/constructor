package day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        //verilen bir multi-dimensional array in tum elementlerini yazdiran
       // bir method olusturun
            int [][]sayilar={{1,2,3,4,},{5,2},{3,4,5}};

            elementleriYazdir(sayilar);


}

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i <sayilar.length ; i++) {//i=0,1,2 degerleri alacak
            for (int j = 0; j <sayilar[i].length ; j++) {//inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j]+" ");


            }

        }
    }



}
