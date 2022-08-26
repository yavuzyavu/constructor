package calımax;

import java.util.Locale;
import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz"+
                "\n kadin icin K erkek icin E harfini giriniz ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        if (cinsiyet =='E'){
            System.out.println("gecerli yas giriniz");}
        else if (yas<65){
            System.out.println("emekli olamazsin");}
        else {
            System.out.println("emekli olabilirsin");
            if (cinsiyet == 'K') {
                System.out.println("gecerli  yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");}
            if(yas>190) {
                System.out.println("gecerli bir tercih giriniz");}}}}
