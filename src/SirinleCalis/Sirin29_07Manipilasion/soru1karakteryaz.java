package SirinleCalis.Sirin29_07Manipilasion;

public class soru1karakteryaz {
    public static void main(String[] args) {
        String str= "Java";
        System.out.println(str.substring(1,3));
        String yeniStr=str.toUpperCase().substring(1,str.length()-1);
        System.out.println(yeniStr);
    }
}
