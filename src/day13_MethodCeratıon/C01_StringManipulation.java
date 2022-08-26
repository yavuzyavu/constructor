package day13_MethodCeratıon;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String str="$13.99";
        String str1="$10.55";

        str=str.replaceAll("\\D","");
        str1=str1.replaceAll("\\D", "");
        System.out.println(str+ " "+str1);
        double sayi=Double.parseDouble(str);
        double sayi2=Double.parseDouble(str1);
        System.out.println("$"+(sayi+sayi2)/100);


    }

}
