package gurup_calisma.ATMProje;

import java.util.Scanner;

public class Islemler {

    Atm musteri1 = new Atm("Abdullah Kadioglu", "2203", "1234 4562 4513 3456", 10000);
    static Scanner scan = new Scanner(System.in);

    void sifre() {
        System.out.println("kartli islem icin 1'e basiniz \n kartsiz islem icin 2'ye basiniz");
        Scanner scan2=new Scanner(System.in);
        int sayi = scan.nextInt();
        boolean degistir = false;
        while (!degistir) {
            if (sayi == 1) {

                System.out.println("lutfen kart no giriniz");
                scan.nextLine();
                String kartnumarasi = scan2.nextLine().replaceAll("\\s", "");

                scan.nextLine();
                System.out.println("lutfen sifreyi giriniz");
                scan.next();
                String girilenSifrre = scan.nextLine();

                menu();

                if (kartnumarasi.equals(musteri1.getKartNo()) && girilenSifrre.equals(musteri1.getSifre())) {
                    degistir= true;
                    menu();
                } else {
                    System.out.println("sifre ya da kart yanlis");
                }

            } else if (sayi == 2) {
                System.out.println("lutfen sifreyi giriniz");
                String girilenSifrre = scan.nextLine();

                if (girilenSifrre.equals(musteri1.getSifre())) {
                    degistir=true;

                }
            } else {
                System.out.println("yanlis secim yaptiniz");
                sifre();
            }

        }

    }
    void menu(){
        System.out.println("Islem Seciniz\n1-Bakiye sorgula, \n2-para yatirma, \n3- para cekme,\n4- para gonderme," +
                "\n5- sifre degistirme ve\n6- cikis.");
        int secim=0;
        try {
             secim=scan.nextInt();
        } catch (Exception e) {
            System.out.println("hatali giris");
            menu();

            switch (secim){
                case 1:
                    bakiyeSorgula();
                    menu();
                    break;
                case 2:paraYatirma();
                menu();
                break;
                case 3:paraCek();
                menu();
                break;
                case 4: paragonderme();
                menu();
                break;
                case 5: sifreDegistirme();
                menu();
                break;
                case 6:
                    System.out.println("islemleriniz bitti iyi gunler");

            }

        }
    }

    private void sifreDegistirme() {
        System.out.println("mevcut sifrenizi kontrol ediniz");
        String mevcutSifre=scan.next();
                if(mevcutSifre.equals(musteri1.getSifre())){
                    System.out.println("yeni sifre giriniz");
                    musteri1.setSifre(scan.next());
                    System.out.println("sifreniz degistirildi");
                    menu();
                }else{
                    System.out.println("yanlis sifre girdiniz");
                    sifreDegistirme();
                }
;
    }

    private void paragonderme() {
        System.out.println("Lutfen ıban no giriniz");
        String ibanNo=scan.nextLine().toUpperCase().replaceAll(" ", "");
        if(ibanNo.length()==26 && ibanNo.startsWith("TR")) {
            System.out.println("ıban no dogru, Lutfen gondereceginiz miktari giriniz");
            double gonderilecekTtr=scan.nextDouble();
            if(gonderilecekTtr<= musteri1.getBakiye()){
                musteri1.setBakiye(musteri1.getBakiye()-gonderilecekTtr);
                System.out.println("isleminiz tamamladi bakiyeniz: "+ musteri1.getBakiye());
            }else {
                System.out.println("Bakiyeniz yetersiz lutfen para ekleyiniz");
                paragonderme();
            }

        }else {
            System.out.println("gecersiz iban");
            paragonderme();
        }
    }

    private void paraCek() {
        System.out.println("Cekmek istediginiz tutari giriniz:");
        int cekilecekTutar= scan.nextInt();
        if (musteri1.getBakiye()>=cekilecekTutar){
        musteri1.setBakiye(musteri1.getBakiye()-cekilecekTutar);
            System.out.println("para cekme isleminiz gerceklesti kalan bakiyeniz: "+musteri1.getBakiye());
            menu();
        }else {
            System.out.println("yetersiz bakiye");
            paraCek();
        }

        }

    private void paraYatirma() {
        System.out.println("ne kadar yatirmak istediginizi giriniz lutfen");
        double yatirilan=scan.nextInt();
        if(yatirilan<0){
            yatirilan=yatirilan*(-1);}

        musteri1.setBakiye(musteri1.getBakiye()+yatirilan);
        bakiyeSorgula();}


    private void bakiyeSorgula() {
        System.out.println("Bakiyeniz: " + musteri1.getBakiye());
        double bakiye=scan.nextDouble();
        menu();
    }
}


