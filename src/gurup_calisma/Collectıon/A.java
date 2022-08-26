package gurup_calisma.Collectıon;

import java.util.LinkedList;
import java.util.ListIterator;

public class A {
    public static void main(String[] args) {
        // Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

        LinkedList<String> llist = new LinkedList<>();
        llist.add("gul");
        llist.add("lale");
        llist.add("papatya");
        llist.add("cigdem");
        llist.add("menekse");
        llist.add("karanfil");

        System.out.println("Orjinal llist : "+llist);

        ListIterator li1 =llist.listIterator();

        while (li1.hasNext()){

            li1.next();
        }

        while (li1.hasPrevious()){

            System.out.print(li1.previous()+" ");
        }


    }

}
