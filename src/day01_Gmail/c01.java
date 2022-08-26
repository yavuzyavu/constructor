package day01_Gmail;

public class c01 {
    public static void main(String[] args) {
        String cumle = "Java cok kolay, java cok guzel";
        String kelime = "Java";
        int kelimeIlkIndex= cumle.lastIndexOf(kelime);
        int kelimeSonIndex= cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cümlede kullanilmamis");
    }
        else if(kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede bir kere kullanilmis");
}
        else {
            System.out.println("verilen kelime cümlede birden fazla kkullanilmis");}}}





