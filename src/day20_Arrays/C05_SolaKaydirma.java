package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
        //yukarida degistirdigimiz array i ilk duruma getirmek icin saga kaydiralim

        temp =arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];


        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
