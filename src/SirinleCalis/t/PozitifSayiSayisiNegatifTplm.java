package SirinleCalis.t;

public class PozitifSayiSayisiNegatifTplm {
    public static void main(String[] args) {
        /*
    39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
​
    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.
    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
     */

        int [] sayi= {1, 2, 3, 4, 5, 6,12, 7, 8, 9, 10, -11, -12, -13, -14, -15,-1};

        System.out.println(pozitifNegatif(sayi));

    }

    private static String pozitifNegatif(int[] sayi) {
             int counter=0;
             int  tplm=0;

        for (int i = 0; i <sayi.length ; i++) {

            if(sayi[i]>=0){
                counter++;

            }else{
                tplm+=sayi[i];
            }

        }
        return counter +" "+tplm;

    }




}
