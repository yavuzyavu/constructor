package calımax;

import java.util.Locale;
import java.util.Scanner;

public class Sss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gün = scan.nextLine().toLowerCase();


        if (gün.equals("pazartesi")) {
            System.out.println("hafta içi");
        } else if (gün.equals("sali")) {
            System.out.println("hafta içi");
        } else if (gün.equals("carsamba")) {
            System.out.println("hafta içi");
        } else if (gün.equals("persembe")) {
            System.out.println("hafta içi");
        } else if (gün.equals("cuma")) {
            System.out.println("hafta içi");
        } else if (gün.equals("cumartesi")) {
            System.out.println("hafta sonu");}
              else if (gün.equals("pazar")) {
                System.out.println("hafta sonu");}
                else{
            System.out.println("lutfen gecerli bir gun giriniz");
            }
        }
    }

