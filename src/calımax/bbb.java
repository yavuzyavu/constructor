package calımax;

import java.util.Scanner;

public class bbb {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen dikdortgenin kısa kenarini giriniz");
        int kısaK=scan.nextInt();
        System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
        int uzunK=scan.nextInt();

        if (kısaK==uzunK){
            System.out.println("kare");

        }
        else {
            System.out.println("dikdortgen");
        }

    }



}
