package gurup_calisma.ucusProje;

import java.util.Arrays;
import java.util.List;

public class YolcuIslem {
    public static void yolcu() {
        Yolcu yolcu1 = new Yolcu("Sefa", 68, "D", "G");


        double biletUcreti=hesap(yolcu1.getYas(), yolcu1.getSehir(), yolcu1.getBiletTuru());
        System.out.println("bilet ucreti:"+biletUcreti);
        System.out.println(yolcu1);
        System.out.println("TEAM10 AIRLINES");
    }

    private static double hesap(int yas, String varilacakSehir, String biletTuru) {

        List<String> sehirler = Arrays.asList("B", "C", "D");
        int[] fiyatlar = {50, 70, 90};
        double ucret = 0;

        for (int i = 0; i < sehirler.size(); i++) {
           // for (int j = i; j < i + 1; j++) {
                if (varilacakSehir.equals(sehirler.get(i))) {
                    if (yas < 12) {
                        ucret = fiyatlar[i] * 0.5;
                        System.out.println("yas inndiriminden faydalanilmistir");
                    } else if (yas <= 24) {
                        ucret = fiyatlar[i] * 0.9;
                        System.out.println("yas inndiriminden faydalanilmistir");
                    } else if (yas >= 65) {
                        ucret = fiyatlar[i] * 0.7;
                        System.out.println("yas inndiriminden faydalanilmistir");
                    } else
                        ucret = fiyatlar[i];

                }
            }

        if (biletTuru.equalsIgnoreCase("G-D")) {
            ucret = ucret * 2 * 0.8;
            System.out.println("gidis donus yon indiriminden faydalandiniz");
        }else if (yas>24 && yas<65){
            System.out.println("indirimsiz yolcu");
        }
        return ucret;
    }
}
