package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_tekrarEdenSayilar {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5, 5};
        Arrays.sort(arr);

        List<Integer> tekrarEdenler = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !tekrarEdenler.contains(arr[i])) {
                tekrarEdenler.add(arr[i]);
                System.out.print(arr[i] + " ");

            }


        }

    }
}
