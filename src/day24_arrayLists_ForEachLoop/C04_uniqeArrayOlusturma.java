package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_uniqeArrayOlusturma {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3};
        int[] uniqeArray = uniqeArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqeArray));
    }

    public static int[] uniqeArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//1,2,3,3,3,4,5,5,5,5,6,6,9
        List<Integer> tekrarsizList = new ArrayList<>();

        //yanindaki elemente esit olmayanlari listeye ekliyor
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tekrarsizList.add(arr[i]);
            }

        }

//son elementi kontrol edip , yoksa listeye ekliyoruz
       if (!tekrarsizList.contains(arr[arr.length - 1])) {
            tekrarsizList.add(arr[arr.length - 1]);
        }
       //tekrarsiz list==>1,2,3,4,5,6,9
        //tekrarsiz listenin size methodunu kullanarak bir array olusturduk
        int[] tekrarsizArr = new int[tekrarsizList.size()];

        //tekrarsiz listenin butun elemanlarini yeni array'e atadik
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = tekrarsizList.get(i);

        }
        //olusturdugumuz array i main methoda dondurduk
        return tekrarsizArr;
    }
}
