package SirinleCalis;

import java.util.Scanner;

public class C07_ForLoopp {
    // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
//       Kullanicinin girdigi String�in palindrome olup olmadigini
//       kontrol eden bir program yazin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime girin");
        String kelime=scan.nextLine();
        String tersKelime="";


        for (int i = 1; i <=kelime.length() ; i++) {
            tersKelime=tersKelime+kelime.charAt(kelime.length()-i);


        }

        if(kelime.equals(tersKelime)){
            System.out.println(kelime+" palindromedir");
        }else{
            System.out.println(kelime+ " degildir");
        }

    }

}

