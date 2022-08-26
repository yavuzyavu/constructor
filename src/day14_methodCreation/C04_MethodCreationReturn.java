package day14_methodCreation;

public class C04_MethodCreationReturn {
    // verilen isim ve soyismi ilk harfi buyuk, geriye kalanlari * olacak sekilde degistirip bize bu
    // halini donduren bir method olusturun.

    public static void main(String[] args) {



        String isim= "Abdullah";
        String soyisim= "Kadioglu";
        String gizliIsim= isimGizle(isim,soyisim);
        System.out.println(isim+ " "+soyisim ); //Abdullah Kadioglu
        System.out.println(gizliIsim); //A******* K*******





    }public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()
            + isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println(isim+" "  +soyisim);
        return isim+ " "+soyisim;
    }
}
