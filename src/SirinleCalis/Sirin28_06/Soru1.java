package SirinleCalis.Sirin28_06;

public class Soru1 {
    public static void main(String[] args) {
        String str= "Miami 33018 ......";
        int lenghOfStr =str.replaceAll("[^A-Za-z0-9]", "").replaceAll("\\s","").length();
        System.out.println(lenghOfStr);



    }
}
