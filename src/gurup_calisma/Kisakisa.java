package gurup_calisma;
/*Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
 Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
 */

import java.util.Scanner;

public class Kisakisa {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi tam olarak giriniz");
        String isim=scan.nextLine();
        int x=isim.indexOf(" ");
        int x1=isim.lastIndexOf(" ");
        String sonuc=isim.substring(0,1).toUpperCase()+"."+isim.substring(x,x+2).toUpperCase().trim()+"."+
                     isim.substring(x1,x1+2).toUpperCase().trim()+".";
        System.out.println(sonuc);

}}
