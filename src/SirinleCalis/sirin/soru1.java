package SirinleCalis.sirin;

public class soru1 {
    public static void main(String[] args) {
        String isim1="Ali Can";
        String isim2="Merve Star";
        String isim3= "Mark Tom";

        int name1Lenght = isim1.replaceAll("\\s","").length();
        int name2Lenght = isim2.replaceAll("\\s","").length();
        int name3Lenght = isim3.replaceAll("\\s","").length();
        int totalLenght = (name1Lenght+name2Lenght+name3Lenght);
        System.out.println(totalLenght);

    }
}
/*
     String name1 = "Ali C a n ";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";
        int name1Lenght = name1.replaceAll("\\s","").length();
        int name2Lenght = name2.replaceAll("\\s","").length();
        int name3Lenght = name3.replaceAll("\\s","").length();
        int totalLenght = (name1Lenght+name2Lenght+name3Lenght);
        System.out.println(totalLenght);

 */

