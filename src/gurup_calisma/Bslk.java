package gurup_calisma;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;
//Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

public class Bslk {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki kelime giriniz");
        String str1= scan.nextLine();
        String str2= str1.replaceAll("\\s", "");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str2)? "yok": "var");
        System.out.println(str1.contains(" ")? "var" : "yok");





    }


}
