package day13_MethodCreatıon;

public class C03_StringManipulations {
    public static void main(String[] args) {
        String str = "  Java ogrenmek123 Cok kolay@  ";
        String str2 = str.replaceAll("\\d", "").replaceAll("C",
                "c").replaceAll("@", ".");
        System.out.println(str2);

    }
}
