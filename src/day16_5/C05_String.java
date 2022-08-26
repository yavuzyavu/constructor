package day16_5;

import java.util.Scanner;

public class C05_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cumle olusturmak icin 1. kelimeyi giriniz");
        String str1= scan.next().toLowerCase();
        System.out.println("cumle olusturmak icin 2. kelimeyi giriniz");
        String str2= scan.next().toLowerCase();
        System.out.println("cumle olusturmak icin 3. kelimeyi giriniz");
        String str3= scan.next().toLowerCase();
        System.out.println("cumle olusturmak icin 4. kelimeyi giriniz");
        String str4= scan.next().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+ " "+str2
        + " "+str3+ " "+str4 +".");



    }

}
