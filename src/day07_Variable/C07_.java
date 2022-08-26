package day07_Variable;

import java.util.Scanner;

public class C07_ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in)
;
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" calismalisin");
        }
        else {
            System.out.println("Emekli olabilirsin");
    }
}}
