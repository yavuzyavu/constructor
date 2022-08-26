package gurup_calisma.gurup1407;

public class SoruSesliHarf {
    public static void main(String[] args) {
       /* Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
        Test Data:
       java is fun
        Beklenen Çıktı:
        Stringdeki sesli harf sayısı: 4
        */
        String cumle = "ali veli";
        String sesliHarf = "aeiou";
        int sayac = 0;

        sesliHarfBul(cumle, sesliHarf, sayac);
    }

    private static void sesliHarfBul(String cumle, String sesliHarf, int sayac) {
        for (int i = 0; i < cumle.length(); i++) {
            for (int j = 0; j < sesliHarf.length(); j++) {
                if (cumle.charAt(i) == sesliHarf.charAt(j)) {
                    sayac++;
                }
            }

        }
        System.out.println(sayac);
    }
}
