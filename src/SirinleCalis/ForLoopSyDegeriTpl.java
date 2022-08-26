package SirinleCalis;

public class ForLoopSyDegeriTpl {
    public static void main(String[] args) {

        int sayi = 34565;
        int tplm = 0;
        for (int i = sayi; i != 0; i /= 10) {
            tplm += i % 10;
        }

        System.out.println(tplm);

        while (sayi != 0) {
            tplm += sayi % 10;
            sayi /= 10;
            System.out.println(tplm);
        }



    }
}

