package SirinleCalis.t;

public class Ortalama {
    public static void main(String[] args) {

      /*Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        Array =  [20, 30, 25, 35, -16, 60, -100 ]
        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0

       */

        int [] sayi= {20, 30, 25, 35, -16, 60, -100};
        int ort=0;

        for(int each:sayi){
            ort+=each;

        }
        System.out.println(ort);
        ort/=sayi.length;

        System.out.println(ort);
    }
}
