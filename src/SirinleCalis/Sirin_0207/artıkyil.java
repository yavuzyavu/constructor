package SirinleCalis.Sirin_0207;

import java.util.Scanner;

public class artıkyil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yili giriniz");
        int yil= scan.nextInt();

        if(yil%100==0 && yil%400==0 || yil%100!=0 &&yil%4==0 ){
            System.out.println("girilen yil artik yil");}
        else {
            System.out.println("girilen yil artik yil degil");
        }



    }


}
