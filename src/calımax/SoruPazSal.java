package calımax;

import java.util.Scanner;

public class SoruPazSal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        {System.out.println("lutfen bir gun ismi giriniz");}
        String gun=scan.nextLine().toLowerCase();
    if (gun.equals("pazartesi")|| gun.equals("pazar")){
        System.out.println("Paz");}
    else if (gun.equals("sali")){
        System.out.println("Sal");}
    else if (gun.equals("carsamba")){
        System.out.println("Car");}
   else if  (gun.equals("cuma")|| gun.equals("cumartesi")){
        System.out.println("Cum");
    }
    else{
        System.out.println("lutfen gecerli bir gün ismi giriniz");}



}}
