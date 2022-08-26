package SirinleCalis.t;

public class soru1 {
    public static void main(String[] args) {
       /* Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
​
        Test Data:
​
        isPrime(31)
        true
​
        isPrime(18)
        false
        
       */
        int sayi=33;
        System.out.println(asalsayi(sayi));

    }

    public static String asalsayi(int sayi) {

        for (int i = 2; i <sayi/2 ; i++) {

            if(sayi%i==0){
                return "asal degildir";
            }
        }
        
       return "asal dir";

    }
}
