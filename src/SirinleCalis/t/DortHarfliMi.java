package SirinleCalis.t;

public class DortHarfliMi {
    public static void main(String[] args) {
       /* 34-----
                String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
​
​
        Test Data:
        isFourLetters(["Tomato", "Potato", "Pair"])
​
     ["Pair"]

        */

        String [] kelime= {"Tomato", "Potato", "Pair","Very"};


        kacKarakter(kelime);



    }

    private static void kacKarakter(String[] kelime) {

        for (int i = 0; i <kelime.length ; i++) {
            if (kelime[i].length()==4){
                System.out.println("kelime = " + kelime[i]);

            }

        }
    }
}
