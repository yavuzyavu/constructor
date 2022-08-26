package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        
        Araba arb1=new Araba();
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Audi";
        System.out.println("arb1.marka = " + arb1.marka);

        // access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz model'e ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor
        // model' i degistirelim ama goremeyelim
        // yakiti'da gorelim ama degistiremeyelim
        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        // 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim
        arb1.setModel("a5"); // model olarak a5'i atadik
        // model'i yazdirma imkanimiz yok, cunku getter method'u yok

      //model olarak a5 atadik. model i yazdirma imkanimiz yok

        System.out.println(arb1.getYakıt());  // Elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz cunku setter method'u yok


    }
}
