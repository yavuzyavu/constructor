package gurup_calisma.gurupProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookIslem {
    static Scanner scan = new Scanner(System.in); //tüm methodlardan ulaşabilmek için, class
    // seviyesinde ve static olmalıdır.

    static int sayac2 = 1000; //static yapıyoruz çünkü her seferinde sayac güncellenecek

    static List<Book> kitapListesi = new ArrayList<>();
    //diamond içine--> data tipi yazılır.
    //oluşturacagın objelerin data tipi Book class bilgileridir, yani burada data tipimiz Book classı olmuş oluyor.

    public static void main(String[] args) {

        menu2();
    }


    public static void menu2() {
        Scanner scan2=new Scanner(System.in);

        System.out.println("**** TEAM10 KUTUPHANESİ ****");
        System.out.println("isleminiz seciniz\n1-kitap ekle" +
                "\n2-numara ile kitap goruntule" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitapları listele" +
                "\n6-cikis");
        /*
        eğer Scanner objesi static olmazsa, obje oluşturarak ulaşmamız gerekir
        BookIslem obj2=new BookIslem();
        int islem=obj2.scan.nextInt();
         */
        try {
            int islem = scan2.nextInt();
            switch (islem) {
                case 1:
                    kitapEk();
                    menu2();
                    break;
                case 2:
                    noIleAra();
                    menu2();
                    break;
                case 3:
                    bilgiIleAra();
                    menu2();
                    break;
                case 4:
                    noIleSil();
                    break;
                case 5:
                    Listele();
                    menu2();
                    break;
                case 6:
                    cikis1();
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız !! ");
                    menu2();
                    break;
            }
        } catch (Exception e) {
            System.out.println("sadece rakam giriniz");
            menu2();

        }
    }

    private static void kitapEk() {
        System.out.println("kitap adı giriniz : ");
        String kitapAdi = scan.nextLine();
        System.out.println("yazar adı giriniz : ");
        String yazarAdi = scan.nextLine();
        System.out.println("kitap fiyatı giriniz : ");
        int fiyat = scan.nextInt();
        int id = ++sayac2;
        Book kitap = new Book(kitapAdi, yazarAdi, fiyat, id);
        kitapListesi.add(kitap);
    }

    private static void noIleAra() {
        System.out.println("aradiginiz kitabin numarasini giriniz: ");
        int no = scan.nextInt();
        for (Book w : kitapListesi) {
            if (no == w.getKitapId()) {
                System.out.println("aradiginiz kitap:" + w.getKitapId() + w.getKitapAdi() + w.getYazarAdi() +
                        w.getKitapFiyati() + "$");
            }
        }
    }

    private static void bilgiIleAra() {
        System.out.println("kitap adini veya yazar adini giriniz");
        String ad = scan.nextLine();
        for (Book w : kitapListesi) {
            if (ad.equals(w.getKitapAdi()) || ad.equals(w.getYazarAdi())) {
                System.out.println("aradiginiz kitap " + w.getKitapId() + w.getKitapAdi() + w.getYazarAdi() +
                        w.getKitapFiyati() + "$");

            }
        }
    }

    private static void noIleSil() {
        boolean cıksinMi=false;
        while (!cıksinMi){
            Scanner scan3=new Scanner(System.in);

        try {
            System.out.println("sileceginiz kitabin Id'sini giriniz");
            int sayi = scan3.nextInt();
            for (Book w : kitapListesi) {
                if (sayi == w.getKitapId()) {
                    System.out.println("silinen kitap" + w.getKitapId() + w.getKitapAdi() + w.getYazarAdi()
                            + w.getKitapFiyati() + "$");
                    kitapListesi.remove(w);
                    break;
                }
            } menu2();
        }
        catch (Exception e) {
            System.out.println("Sadece rakam giriniz");
        }
    }
    }

    private static void Listele() {
        for (Book w : kitapListesi) {
            System.out.println("aradiginiz kitap: "  + w.getKitapId()+" " +  w.getKitapAdi()+" " + w.getYazarAdi() +" "+
                    w.getKitapFiyati() + " TL");

        }
    }

    private static void cikis1() {
        System.out.println("*** iyi günler ***");
    }
}














