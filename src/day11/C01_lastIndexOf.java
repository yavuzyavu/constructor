package day11;

import java.util.Scanner;

public class C01_lastIndexOf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen email yaziniz");
        String email=scan.nextLine();

        if(!email.contains(("@gmail.com"))){
            System.out.println("lutfen gmail adresi giriniz");}
        else if(email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");}
           else{ System.out.println("duzgun bir karakter girermisin");}
    }
}
