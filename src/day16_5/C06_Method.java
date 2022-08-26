package day16_5;

import java.util.Scanner;

public class C06_Method {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine().toLowerCase();
        xyzVarMi(str);

        System.out.println(xyzVarMi(str));
    }

    private static boolean xyzVarMi(String str) {
       if(str.contains("xyz")){
           return true;}
    else return false;



    }
}
