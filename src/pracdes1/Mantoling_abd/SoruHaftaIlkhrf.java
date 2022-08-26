package pracdes1.Mantoling_abd;

import java.util.Scanner;

public class SoruHaftaIlkhrf {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun= scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals( "pazar")) {
            System.out.println("Paz");
        }
       else if (gun.equals("Sali")) {
            System.out.println("Sal");
        }else if (gun.equals("Carsamba")) {
            System.out.println("Car");
        }else if (gun.equals("Persembe")) {
            System.out.println("Per");
        }else if (gun.equals("cuma") || gun.equals ("cumartesi")) {
            System.out.println("Cum");
        }else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }





    }}
