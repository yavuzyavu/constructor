package SirinleCalis.Sirin0106;

public class C02_StringManipultion {
    public static void main(String[] args) {
        String str="Java";
        String chr= "a";
        boolean sonuc= str.contains(chr);
        System.out.println(sonuc);
        boolean sonuc1= str.indexOf(chr)>=0;
        System.out.println("sonuc1 = " + sonuc1);

        String str1= str.replaceAll(chr,"");
        boolean sonuc2= str1.length()<str.length();
        System.out.println("sonuc2 = " + sonuc2);


    }
}
