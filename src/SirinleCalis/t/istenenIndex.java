package SirinleCalis.t;

import java.util.Scanner;

public class istenenIndex {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.next();
        System.out.println("aradiginiz karakterin index 'ini soyle");
        int kark= scan.nextInt();


        System.out.println(kark+". poziyondaki karakter: " +kelime.charAt(kark));
    }
}
