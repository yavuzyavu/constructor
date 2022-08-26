package calımax;

import java.util.Scanner;

public class ççç {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println((sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println((sayi1 * sayi2));
        } else if (sayi1 > 0 && sayi2 < 0) {
            System.out.println();
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir yutan eleman");

        }


    }
}

