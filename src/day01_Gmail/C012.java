package day01_Gmail;

import java.util.Scanner;

public class C012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        if (!email.contains("gmail.com")) {
            System.out.println("lutfen gmail adresi yaziniz ");
            if (!email.contains("gmail")) {
                System.out.println(" lutfen gmail adresi giriniz");}
                else if (email.lastIndexOf("gmail.com") == (email.length() - 10)) {
                    System.out.println("email adresiniz kaydedildi");
                }

                else {
                    System.out.println("lutfen yazimi kontrol ediniz");
                }


            }
        }
    }
