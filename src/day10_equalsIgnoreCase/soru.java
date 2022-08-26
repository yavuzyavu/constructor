package day10_equalsIgnoreCase;

public class soru {
    public static void main(String[] args) {
        String str= "Ali Can";
        String str2= "ALİ CAN";
        String str3= "Ali Can_";
        String str1= "ali can";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str.equalsIgnoreCase(str1));
    }
}
