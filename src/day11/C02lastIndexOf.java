package day11;

public class C02lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="java";
        int kelimeIlkIndeks= cumle.indexOf(kelime);
        int kelimeSonIndeks= cumle.lastIndexOf(kelime);

        if (kelimeIlkIndeks==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");}
        else if(kelimeIlkIndeks==kelimeSonIndeks) {
            System.out.println("verilen kelime cumlede 1 kere kullanilmis");
        }
        else {
            System.out.println("verilen kelime cumlede birden fazla kullnilmis");

        }



}}
