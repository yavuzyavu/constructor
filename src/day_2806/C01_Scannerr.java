package day_2806;

import java.util.Scanner;

public class C01_Scannerr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isci isi kac gunde bitirir");
        int birIsiBitirmeSuresi=scan.nextInt();

        System.out.println("toplam kac isci calisacak");
        double iscisayisi=scan.nextDouble();

        double cokluBitirmeSuresi=birIsiBitirmeSuresi/iscisayisi;
        System.out.println("cokluBitirmeSuresi = " + cokluBitirmeSuresi);




    }
}
