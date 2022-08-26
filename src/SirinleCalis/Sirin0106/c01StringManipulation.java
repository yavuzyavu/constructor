package SirinleCalis.Sirin0106;

public class c01StringManipulation {
    public static void main(String[] args) {
        String str = " !1a23b4?es ";
        String str1 = str.replaceAll("\\s", "");
        System.out.println("str1=" + str1);
        String str2 = str.replaceAll("\\s", "").
                replaceAll("\\w", "");
        System.out.println("str2=" + str2);
        boolean sonuc = str1.length() >= 8 && str2.length() >=1;
        System.out.println(sonuc);

    }
}
