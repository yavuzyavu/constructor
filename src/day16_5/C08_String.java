package day16_5;

import java.util.Scanner;

public class C08_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("bir kelime giriniz:");
        String kelime= scan.next();
        char ortaKrk= kelime.charAt((kelime.length()-1)/2);

        if(kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("ortanca karakter:"+ortaKrk);
        }

    }
}
