package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hizlidir
        bunun icin bir String olusturup, 10000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip aradaki farki bulalim

        ayni islemi String Builder icin de yapalim

         */
        String str= "abdullah";


        for (int i = 0; i <1000 ; i++) {
            str+=".";



        }
    }
}
