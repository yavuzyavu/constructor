package day6_pratice;

import java.util.Scanner;

public class Q11_odev {
    public static void main(String[] args) {
        String pin="abdullah";
        int girisHakki=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("**********HOSGELDİNİZ**************");

        while (true){
            System.out.println("pin kodunuzu giriniz:");
            String girilenPin=scan.nextLine();
            if(pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz");
                break;
            }else {
                System.out.println("yanlis giris yaptiniz");
                girisHakki--;
                System.out.println();
            }
        }
    }
}
