package SirinleCalis.t;

public class polgrom {
    public static void main(String[] args) {
       /* 13----
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
        Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
        Test Data:
        madam
        Beklenen Çıktı:
        True

        */
        String kelime= "kalem";
        String tersK="";


        for (int i = kelime.length()-1; i >=0 ; i--) {

            tersK+=kelime.charAt(i);




        }

        System.out.println(tersK.equals(kelime));
    }
}
