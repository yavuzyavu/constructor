package day7_practice;

import java.util.ArrayList;
import java.util.List;

public class Q05_ArrayList {/*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
 *  1. Kullanicidan ismini isteyelim
 *  2. Kullanici adindaki bosluklari silelim.
 *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
 *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
 *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
 */

    public static void main(String[] args) {
        List<String> databaseIsimler=new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("Ismail");
        databaseIsimler.add("AbdulBaki");
        databaseIsimler.add("Abdullah");
        databaseIsimler.add("Oguz");
        databaseIsimler.add("Enes");
        System.out.println();
    }
}
