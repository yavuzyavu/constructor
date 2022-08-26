package day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {
        String isim= "Abdullah";
        String soyisim= "Kadioglu";
        String kartNo= "1234 6548 9874 2587";
        System.out.println(isim.substring(3)); //ullah
        System.out.println(soyisim.substring(soyisim.length()-3));//glu
        System.out.println(isim.substring(2,4));//du
        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKln= isim.substring(1).replaceAll("\\w",
                "*");
        String soyIsim= soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKln= isim.substring(1).replaceAll("\\w",
                "*");
        String kartNoIlk4=kartNo.substring(0,4) ;
        String kartNoGryK="**** **** ****" ;
        System.out.println(isimIlkHarf+isimGeriyeKln+" " +soyIsim+soyisimGeriyeKln+" "+
                kartNoIlk4+ kartNoGryK);




    }
}
