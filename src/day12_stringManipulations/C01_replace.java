package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {
        String str= "Bug un ha va c ok gu zel";
        System.out.println(str.replace(" ",""));
        System.out.println(str.replace("h","J").replace(" ", ""));
        System.out.println(str.replace("gu zel", "harika"));
        System.out.println(str.replace("Bug un ha va c ok gu zel", "Java bugun harika"));

    }
}
