package SirinleCalis;

import java.util.Scanner;

public class C08_ForLoop {
    /*Soru 10 ) Kullanicidan iki sayi isteyin.
    Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
    sonucu yazdiran bir program yaziniz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz, birinci sayi " +
                        "ikinci sayidan kucuk olsun");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;
        for (int x = sayi1; x <=sayi2 ; x++) {
           toplam=toplam+x;

        }
        System.out.println("toplam "+toplam);
    }


}
