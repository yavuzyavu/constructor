package day22_multiDimensionalArrays;

public class C05_MdaSonElemanlariCarp {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        int carp = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    carp *= arr[i][j];
                }

            }

        }
        System.out.println(carp);
    }
}
