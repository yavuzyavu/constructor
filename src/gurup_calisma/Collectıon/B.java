package gurup_calisma.Collectıon;

import java.util.Collections;
import java.util.LinkedList;

public class B {
    public static void main(String[] args) {
// Bir LinkedList olusturalim ve ilk eleman ile 4. elemani yerdegistiren java kodunu yaziniz.

        LinkedList<String> llist = new LinkedList<>();
        llist.add("gul");
        llist.add("lale");
        llist.add("papatya");
        llist.add("cigdem");
        llist.add("menekse");
        llist.add("karanfil");

        Collections.swap(llist,0,3);
        System.out.println("Swap sonrasi durum: "+ llist);


    }
}
