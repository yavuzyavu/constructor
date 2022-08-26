package SirinleCalis;

public class Array {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.
            Array: [1551,1223,1443,1267,1789,1023,2020]      */
        int[] rakamlar = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int istdeg = 2020;
        boolean varMi = false;

        for (int i = 0; i < rakamlar.length; i++) {

            if (istdeg == rakamlar[i]) {
                varMi = istdeg == rakamlar[i];
                break;
            }

        }
        System.out.println(varMi);

        for (int each : rakamlar) {
            if (istdeg == each) {
                varMi = istdeg == each;break;

            }
        }
        System.out.println(varMi);


    }
}

