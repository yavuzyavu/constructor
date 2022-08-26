package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    //static yazmasinin sebebi tum methodlardan ulasmak icin
    //gokteki ay gibi her yerden ulasilsin

    public static void girisPaneli() {

        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();//kontrol buyuk harfle
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                break;
            case "2":
                islemMenusu();
                kisiTuru = "OGRETMEN";
                break;
            case "Q":
                break;
            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;

        }


    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu  "+kisiTuru +"  lutfen asagidaki islmleri seciniz");


        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz: ");
        int secilenIslem=scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                //cikis();
                break;
            default:
                System.out.println("guzel birsey gir");
                islemMenusu();
                break;

        }

    }

    private static void silme() {
        System.out.println("****"+ kisiTuru+"silme sayfasina hosgeldin" );
        boolean flag=true;

        if(kisiTuru.equalsIgnoreCase("OGRENCİ")){
            System.out.println("silmek istedigin kimlik no gir");

            String silinecekKimlikNo=scan.next().replaceAll(" ","");

            for(Kisi w:ogrncList){
                //if(w.ge)
                //System.out.println("silinen ogrenci"+w.);
            }
            if(flag){
                System.out.println("bu tc ile ogrenci yok silinemedi");

            }
        }else{
            System.out.println("silmek istedigin kimlik no gir");

            String silinecekKimlikNo=scan.next().replaceAll(" ","");

            for(Kisi w:ogrncList){
                //if(w.ge)
                //System.out.println("silinen ogrenci"+w.);
            }
            if(flag){
                System.out.println("bu tc ile ogrenci yok silinemedi");

            }
        }


    }

    private static void listeleme() {
        System.out.println("**** "+ kisiTuru+" listeleme sayfasina hosgeldin");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("ogrncList = " + ogrncList);
        }else{
            for (Kisi each:ogrtmnList) {
                System.out.println("each.toString() = " + each.toString());
            }
        }
    }

    private static void arama() {
        System.out.println("****"+ kisiTuru+"arama sayfasina hosgeldin" );
        boolean flag =true;
        if(kisiTuru.equalsIgnoreCase("OGRENCİ"));

        System.out.println("kimlik no giriniz");
        String arananKimlikNo=scan.next().replaceAll(" ","");//kulanici bosluk girerse hiclik yapildi

        for(Kisi w:ogrncList){
            //if(w.)
        }


    }

    private static void ekle() {//bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("**** "+ kisiTuru+"ekleme sayfasina hosgeldiniz");



    }}
