package day01_Gmail;

public class C04_Contanıs {
    public static void main(String[] args) {
        String cumle = "Java buyuk dunya kucuk";
         if(cumle.contains("buyuk")&& cumle.contains("kucuk")) {
            System.out.println("karar ver buyuk mu yazdırayım kucuk mu");     }

    else  if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());}
        else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());}

            else {
            System.out.println("cumle buyuk ya da kucuk icermiyor");
        }
}}
