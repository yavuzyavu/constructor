package SirinleCalis;

public class While {
    public static void main(String[] args) {
        /*Ugly Number:
​
        Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
​
​
        Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
​
        Test Data:
        13
​
        Beklenen çıktı:
        ugly number  degildir
​
        Test Data:
        25
        Beklenen Çıktı:
​
        ugly number         */

        int sayi=50;
        int num=sayi;
        while (num!=1){
            if(num%5==0){
                num/=5;
            }else if(num%3==0){
                num/=3;
            }else if(num%2==0){
                num/=2;
            }
            else{
                System.out.println(sayi+ " ugly sayi degildir");
                break;
            }
            if(num==1){
                System.out.println(sayi+" ugly sayidir");
            }
        }

    }
}
