package calımax;

import java.util.Scanner;

public class soru09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilenGün=scan.next().toLowerCase();
      if(girilenGün.equals("pazar") || girilenGün.equals("cumartesi")){
          System.out.println("Girlen gun HAFTASONU");
      }
    if (girilenGün.equals("pazartesi")||girilenGün.equals("sali")||girilenGün.equals("carsamba")
            ||girilenGün.equals("persembe")||girilenGün.equals("cuma")){
        System.out.println("Girilen gun HAFTAİCİ");
    }
    if(!(girilenGün.equals("pazartesi")||girilenGün.equals("sali")||girilenGün.equals("carsamba")
            ||girilenGün.equals("persembe")||girilenGün.equals("cuma")||(girilenGün.equals("pazar")
            || girilenGün.equals("cumartesi")))){
        System.out.println("Gecerli bir gun ismi giriniz");
    }




    }


}
