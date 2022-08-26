package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Kayra");

        sb.substring(0,3);

        System.out.println();//Kayra
        //bu method String dondurdugu icin StringBuilder'in eski halini degistirmez

        sb.subSequence(0,3);

        System.out.println();//Kayra
    }
}
