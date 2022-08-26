package SirinleCalis.t;

public class remove {
    public static void main(String[] args) {
        /*Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
        Test Data:
        good
        Beklenen Çıktı:
        goo

         */

        String cml= "sirin Kapzan nasilsin";

        System.out.println(cml.substring(0,cml.length()-1));
    }
}
