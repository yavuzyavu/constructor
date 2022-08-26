package SirinleCalis.Sirin_0207;

public class forloop {
    public static void main(String[] args) {
        String isim = "at";
        String str = "";
        if (isim.length() >= 3) {

            for (int i = 20; i < 23; i++) {
                str = str + isim.substring(isim.length() - 2);
            }

            System.out.println("str = " + str);
        }else{
            System.out.println("isim:"+ isim);
        }





    }
}
