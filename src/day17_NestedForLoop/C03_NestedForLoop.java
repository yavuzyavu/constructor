package day17_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen en ve boy degerine gore *'lardan olusan
        bir dikdorgen olusturun
        yuk=3, boy=4
         */
        int yuksklk=4;
        int boy= 8;
        for (int i = 1; i <=yuksklk ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}
