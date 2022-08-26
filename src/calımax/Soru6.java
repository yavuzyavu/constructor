package calımax;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int note=scan.nextInt();

        if (note<0 || note>100) {
            System.out.println("lutfen gecerli bir not giriniz");
        } else if (note<50)
        {   System.out.println("Notunuz: D");}
        else if (note<60){
            System.out.println("Notunuz : C");}
            else if (note<80)
        { System.out.println("Notunuz : B");}
        else
        {System.out.println("Notunuz : A");}







        }
    }

