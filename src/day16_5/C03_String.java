package day16_5;

public class C03_String {
    public static void main(String[] args) {
        String str1="$13.99";
        String str2="&10.55";

        str1=str1.replaceAll("\\D", "");
        System.out.println(str1);

        str2=str2.replaceAll("\\D","");
        System.out.println(str2);

        double sayi=Double.parseDouble(str1);
        double sayi1=Double.parseDouble(str2);
        System.out.println("$" +(sayi+sayi1)/100);




    }
}
