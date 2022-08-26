package SirinleCalis.intervev;

import java.util.Arrays;
import java.util.Scanner;

public class iInterviv {
    public void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str = scan.nextLine();

        String[] arr = str.replaceAll("\\s", "").split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i].equals(arr[i+1])){
                counter++;



            }
            System.out.print(arr[i] +"="+counter);

        }

    }
}
