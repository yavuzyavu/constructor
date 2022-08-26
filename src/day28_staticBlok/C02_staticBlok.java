package day28_staticBlok;

public class C02_staticBlok {


    static int sayi;

    static {
            /*
            Static block class uyelerinin tamamindan once calisir
            (main methodun dan da once )
            static block class olusturuldugunda calisir
            genellikle de class'la

            birden fazla static blok varsa, yukaridan asagi dogru calisir
             */
        System.out.println("Static blok calisti");

    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
    }

    static {
        System.out.println("static blok 2 calisti");
    }


}

