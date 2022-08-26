package SirinleCalis.Sirin_0207;

public class ikiayrıKelime {
    public static void main(String[] args) {
        String isim= "afyon karahisar";
        int x= isim.indexOf(" ");

        System.out.print(isim.substring(0,1).toUpperCase()+isim.substring(1,x));

        System.out.print(isim.substring(x+1,x+2).toUpperCase()+isim.substring(x+2));






    }
}
