package gurup_calisma.gurup1407;

public class Soru1Method {
    public static void main(String[] args) {
        int sayi1=12;
        int sayi2=10;
        int sayi3=2;
        kucukSayiBul(sayi1,sayi2,sayi3);
    }

    private static void kucukSayiBul(int sayi1, int sayi2, int sayi3) {
        if(sayi1<sayi2 && sayi1<sayi3){
            System.out.println(" en kucuk sayi1:"+sayi1);
        }else if(sayi2<sayi1 && sayi2<sayi3){
            System.out.println("en kucuk sayi2 :" + sayi2);
        }else {
            System.out.println("en kucuk sayi3 :" + sayi3);
        }
    }
}
