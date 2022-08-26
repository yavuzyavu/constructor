package day_12;

import java.util.Scanner;

public class c07 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("gideceginiz yol mesafesi (km/sa)");
        double yol=scanner.nextDouble();
        System.out.println("ortalama hiziniz (km/sa):");
        double ort_hiz= scanner.nextDouble();

        double varisSa= yol/ort_hiz;
        System.out.println("varis sureniz:"+varisSa);
    }
}
