package SirinleCalis.Sirin0106;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String isim= "abdullah kadioglu";
        int index= isim.indexOf(" ");
        String sonuc= (isim.substring(0,1)+ isim.substring(index+1,index+2)).toUpperCase();
        System.out.println("sonuc = " + sonuc);


    }
}
