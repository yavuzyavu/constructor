package SirinleCalis.Sirin29_07Manipilasion;

import java.util.Scanner;

public class SoruCode1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki kelime yaziniz");
        String str=scan.nextLine();
        String str2= str.replaceAll("\\s", "");
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str2) ? "yok" : "var") ;







    }
}
