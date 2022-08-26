package SirinleCalis.t;

public class kKacinciEleman {
    public static void main(String[] args) {
        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
    Array: [12,15,43,23,56,76,78,90,77,43]
    Aranan değer:56
    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı     */

        int [] arr={12,15,43,23,56,76,78,90,77,43};
        int deger=43;
        int counter=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]==deger){
                counter++;
                if(counter==2){System.out.println(i);break;}

            }


        }








    }
}
