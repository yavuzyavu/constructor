package SirinleCalis.t;

import java.util.Arrays;

public class Unlulerisay {
    public static void main(String[] args) {

        String cumle = "Abdullah Kadioglu";

        cumle = cumle.replaceAll("\\s", "");
        System.out.println(cumle);

        String[] cumleArr = cumle.split("");
        System.out.println(Arrays.toString(cumleArr));

        String sesliHarf = "aeoiu";

        int counter = 0;

        for (int i = 0; i < cumleArr.length; i++) {

            if (sesliHarf.contains(cumleArr[i].toLowerCase())) {
                counter++;
            }

        }
        System.out.println(counter);


    }


}
