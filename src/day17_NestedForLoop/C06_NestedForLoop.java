package day17_NestedForLoop;

public class C06_NestedForLoop {
    /* verilen stringi asagidaki gibi yazdiran bir program
    input=deniz
     */
    public static void main(String[] args) {
        String input="Ankara";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));// ilk harf icin substring (0,1)
                                                           // olmali


            }
            System.out.println("");
        }

    }
}
