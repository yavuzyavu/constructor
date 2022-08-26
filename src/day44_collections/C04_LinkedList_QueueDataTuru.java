package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {

    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        System.out.println(ll3);//[Adem,Zeynep,Hpolat,Kadir]

        System.out.println(ll3.remove());//Adem

        System.out.println(ll3);//[Zeynep,Hpolat,Kadir]
    }
}
