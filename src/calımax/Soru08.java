package calımax;

import java.util.Scanner;

public class Soru08 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if((harf>='a'&& harf<='z')|| (harf>='A' && harf <='Z')){
            System.out.println("girilen karakter bir harf");
    }
        else {
            System.out.println("girilen harf degil");
        }
}}
