package day11;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("mek"));
        System.out.println(str.indexOf("g"));
        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);
        if (ikincie == -1) {
            System.out.println("verilen str da ikinci e yok");

        } else {
            int uucuncue = str.indexOf("e", ikincie + 1);
            if (uucuncue == -1) {
                System.out.println("verilen str de 3. e yok");
            } else {
                System.out.println("verilen str'daki 3.e'nin index i :"+uucuncue);
            }

        }
    }}
