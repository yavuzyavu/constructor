package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=5;


        int sonuc= carpGetir(sayi1,sayi2);
        System.out.println("illada sonuccu gorelim diyenlere:" +sayi1*sayi2);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        System.out.println("illada sonuccu gorelim diyenlere:" +sayi1*sayi2);

        return sayi1*sayi2;



    }
}

