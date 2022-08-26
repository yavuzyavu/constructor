package day16_5;

import java.util.Scanner;

public class C07_String {
    public static void main(String[] args) {
        String isim1 = "abdullah";
        String isim2 = "ahmet";

        if (isim1.length() % 2 == 0) {
            System.out.println(isim1.substring(0, isim1.length() / 2).concat(isim2)
                    .concat(isim1.substring(isim1.length() / 2)));}
        else{
            System.out.println("isim cift sayili olmadigi icin ortasina yerlestiremedik");
        }


    }
}
