package day16_5;

import java.util.Scanner;

public class C04_String {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();

        if (str.length()>=3) {
            System.out.println(str.substring(str.length() - 2)
                    + str.substring(str.length() - 2) + str.substring(str.length() - 2));
        }else{
            System.out.println(str);
        }


    }
}
