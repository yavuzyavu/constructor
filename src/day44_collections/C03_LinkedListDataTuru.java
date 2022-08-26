package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedListDataTuru {
    public static void main(String[] args) {
        LinkedList ll1 =new LinkedList();

        List<String> ll2=new LinkedList<>();

        Queue<String> ll3=new LinkedList<>();

        Deque<String> ll4=new LinkedList<>();

        ll2.add("berk");
        ll2.add("zeki");
        ll2.add("can");
        ll2.add("ali");

        System.out.println(ll2);//[berk, zeki, can, ali]
        System.out.println(ll2.remove(3));//ali
        //eger listimiz elementlerden olusuyorsa
        //direk sayi yazarsak index olarak kabul eder
        //bir variableye atama yapar ve yazarsak obje kabul eder
        System.out.println(ll2.remove("kemal"));//false
        System.out.println(ll2.isEmpty());//false
        System.out.println(ll2.set(1,"hatice"));
        System.out.println(ll2);

        ll1.add("berk");
        ll1.add("ismail");
        System.out.println(ll1);//[berk,ismail]
        ll2.retainAll(ll1);

        System.out.println(ll2);//[berk]
        System.out.println(ll2.hashCode());//3020251

        ll2.add("fatih");
        System.out.println(ll2.hashCode());//190831485
    }
}
