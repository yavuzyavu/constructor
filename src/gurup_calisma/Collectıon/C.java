package gurup_calisma.Collectıon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class C {
    public static void main(String[] args) {

        //soru: HashSet ile list olusturalim ve  TreeSet ile siralayalim ve listeyi yazdiralim.

        HashSet<String> hs = new HashSet<>();
        hs.add("gul");
        hs.add("lale");
        hs.add("papatya");
        hs.add("cigdem");
        hs.add("menekse");
        hs.add("karanfil");
        hs.add("karanfil");

        System.out.println(hs);

        TreeSet<String> tr= new TreeSet<>(hs);

            for(String w: tr) {

                System.out.print(w+" ");

        }




    }
}
