package pracdes1.Mantoling_abd;

import java.util.Scanner;

public class SoruMaasTeklifi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir maas teklifi giriniz");
        double maas= scan.nextDouble();

        if(maas>80000){
            System.out.println("kabul edilorum");}
        else if (maas>=60000){
            System.out.println("konusabiliriz");
        }
        else {
            System.out.println("malesef kabul edemem");
        }



}}
