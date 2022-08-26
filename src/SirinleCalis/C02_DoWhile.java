package SirinleCalis;

public class C02_DoWhile {
    public static void main(String[] args) {
        /*
        9`dan 190`a kadar 9'un kati olan tum tamsayilari ekrana yazdirin
         */
        int bit=190;
        int bas=9;
        while (bas<=bit){
            if(bas%9==0){
                System.out.print(bas+ " ");

            }
            bas++;

        }



    }}

