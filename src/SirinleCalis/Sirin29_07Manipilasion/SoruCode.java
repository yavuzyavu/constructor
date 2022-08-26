package SirinleCalis.Sirin29_07Manipilasion;

public class SoruCode {
    public static void main(String[] args) {
        String str= "Abdullah kadioglu";
                String str1=str.trim();// bastaki ve sondaki bosluklari giderir
        System.out.println(str1);
                String str2 =str1.replaceAll("\\s",""); //tüm bosluklari giderir
        System.out.println(str2);

    }
}
