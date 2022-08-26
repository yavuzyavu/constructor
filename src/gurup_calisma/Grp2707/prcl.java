package gurup_calisma.Grp2707;

import java.util.Arrays;

public class prcl {
    public static void main(String[] args) {


        /*Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
        alin.
                input : Congratulations
        output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
        sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */
        String kelime = "Congrtulations";

        String[] tebrikler = kelime.split("");
        System.out.println(Arrays.toString(tebrikler));

        for (int k = 0; k < tebrikler.length; k++) {

            if (tebrikler[k].contains("a") ||tebrikler[k].contains("o") ||tebrikler[k].contains("u") ) {
                tebrikler[k] = "i";

            }

        }
        for (int i =tebrikler.length-1; i >=0 ; i--) {

            System.out.print(tebrikler[i]);


        }



    }



}

