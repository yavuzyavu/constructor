package SirinleCalis.intervev;

public class Intervev2 {
    public static void main(String[] args) {

        /*
 * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
 *  alinan sayi kadar
 * return eden metod yaziniz
 *
 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */
        String str= "elma";
        int sayi= 3;
        alinanSayiKadar(str,sayi);

        System.out.println(alinanSayiKadar(str,sayi));

    }

    private static String alinanSayiKadar(String str,int sayi) {

        String ilkKarekter=str.substring(0,1)+str.substring(str.length()-1);
        String bos="";

        for (int i = 0; i <sayi; i++) {

            bos+=ilkKarekter;

        }

        return bos;
    }
}
