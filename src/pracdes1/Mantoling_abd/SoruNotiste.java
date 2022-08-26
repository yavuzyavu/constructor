package pracdes1.Mantoling_abd;

import java.util.Scanner;

public class SoruNotiste {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen notuunuzu giriniz");
        double not=scan.nextDouble();

        if (not<0 ||not >100){
            System.out.println("lutfen geceerli bir not giriniz");
        }else if (not>80){
            System.out.println("notunuz" + " A");}

        else if (not>60) {
            System.out.println("notunuz  B");}
    else if(not>=50){
            System.out.println("notunuz"+ "C");}
    else{
            System.out.println("notunuz  D");

        }


    }

}
