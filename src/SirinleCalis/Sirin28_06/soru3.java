package SirinleCalis.Sirin28_06;

public class soru3 {
    public static void main(String[] args) {
        String str="1a3Bcf4!bbb....";
        int lengh= str.replaceAll( "[0-9]","").length();
        System.out.println(lengh);
    }
}
