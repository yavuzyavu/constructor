package calımax;

import java.util.Scanner;

public class yensoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen günün ilk harfini girin");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P') {
            System.out.println("pazartesi" + " persembe" + " pazar");
        } else if (ilkHarf == 'C') {
            System.out.println("cuma" + " cumartesi");}
         else {
                System.out.println("lutfen gecerli bir harf giriniz");
            }

        }
    }

