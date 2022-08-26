package gurup_calisma.proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
  static Scanner scan=new Scanner(System.in);
  static int sayac=1000;
  static List<Kitap> kitapList=new ArrayList<>();


  public static void menu(){
    System.out.println("----TEAM 10 UTUPHANESİ--------");
    System.out.println("* 1-kitap ekle");
    System.out.println("* 2-numara ile kitap goruntule");
    System.out.println("* 3-bilgi ile kitap goruntule");
    System.out.println("* 4-numara ile kitap sil");
    System.out.println("5-tum kitaplari listele");
    System.out.println("6-cikis");

    int islem=scan.nextInt();

    switch (islem){
      case 1:
        kitapEkle();
        menu();
        break;
      case 2:
        noIleKitapGoruntule();
        menu();
        break;
      case 3:
        bilgiIleKitapGoruntule();
        menu();
        break;
      case 4:
        numaraIleKitapSil();
        menu();
        break;
      case 5:
        tumKitaplariListele();
        menu();
        break;
      case 6:
        cikis();
        menu();
        break;
      default:
        System.out.println("hatali giris yaptiniz");
        menu();
        break;
    }

 }

  private static void cikis() {
    System.out.println("Kitap en iyi arkadastir");
  }

  private static void tumKitaplariListele() {
    for(Kitap w:kitapList){
      System.out.println(w.kitapNo+" "+w.kitapAdi+" " + w.yazarAdi+" "+w.kitapFiyat);

    }
    }

  private static void numaraIleKitapSil() {
    System.out.println("silmek istediginiz kitabin numarasini yaziniz");
    int silNum=scan.nextInt();

    for(Kitap w:kitapList){
      if(silNum==w.kitapNo){
        System.out.println("Sildiginiz Kitap : "+w.kitapNo+" "+w.kitapAdi+" " + w.yazarAdi+" "+w.kitapFiyat);
        kitapList.remove(w);
        break;

      }
    }
  }

  private static void bilgiIleKitapGoruntule() {
    System.out.println("aradiginiz kitabin yazar yada kitap adini giriniz");
    scan.nextLine();
    String bilgi=scan.nextLine();
    for(Kitap w:kitapList)
    { if(bilgi.equals(w.kitapAdi)|| bilgi.equals(w.yazarAdi)){

      System.out.println("Aradiginiz Kitap : "+w.kitapNo+" "+w.kitapAdi+" "+w.yazarAdi+" "+w.kitapFiyat);
    }}
  }

  private static void noIleKitapGoruntule() {
    System.out.println("aradiginiz kitabin nuarasini giriniz");
    int no=scan.nextInt();
    for(Kitap w:kitapList){

      if(no==w.kitapNo){
        System.out.println("Aradiginiz Kitap : "+w.kitapNo+" "+w.kitapAdi+" "+w.yazarAdi+" "+w.kitapFiyat);
      }


    }
  }

  private static void kitapEkle(){
    System.out.println("lutfen kitap adi giriniz");
    String b=scan.nextLine();//dummy kod kullanicidan pes pese alirkern
    String kitapadi=scan.nextLine();

    System.out.println("lutfen yazar adi giriniz");
    String yazarAdi=scan.nextLine();
    System.out.println("kitap fiyatini giriniz");
    int fiyat=scan.nextInt();
    int kitapNo=++sayac;

    Kitap yeniKitap=new Kitap(kitapadi,yazarAdi,fiyat,kitapNo);

    kitapList.add(yeniKitap);





  }


}
