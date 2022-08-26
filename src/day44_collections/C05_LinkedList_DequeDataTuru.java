package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList<>();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        ll4.removeFirstOccurrence("Hasan");
        System.out.println(ll4);//[Cavidan,Mesut,Selim,Tevfik]
        System.out.println(ll4.pop());//LinkedList'in basindaki elementi silip
        //bize dondurur

        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
// Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var
    }
}
