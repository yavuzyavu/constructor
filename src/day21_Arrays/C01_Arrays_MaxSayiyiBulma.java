package day21_Arrays;

public class C01_Arrays_MaxSayiyiBulma {
    public static void main(String[] args) {
        //soru1- verilen bir int array'daki en buyuk sayiyi yazdiran bir method olusturun
        int[] sayilar={369,5,7,1,4,9,5,13,2};

        maxSayiyiYazdir(sayilar);
    }

    private static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }
        System.out.println(maxSayi);

    }


}
