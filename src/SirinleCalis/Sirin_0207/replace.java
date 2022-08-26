package SirinleCalis.Sirin_0207;

public class replace {
    public static void main(String[] args) {
        String str="aliveli";
        String str1=str.replaceAll("\\s", "");
        System.out.println(str.equals(str1)? "yok": "var");
        System.out.println(str.equals(str1));

    }
}
