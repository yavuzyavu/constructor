package SirinleCalis.t;

public class TerstenYazdir {
    public static void main(String[] args) {
        /*
          Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
         */
        String cumle = "Java is very butifull fun";
        String tersCumle = "";

        String[] arr = cumle.split(" ");


        for (int i = arr.length -1; i >= 0; i--) {

            tersCumle += arr[i]+ " ";

        }
        System.out.println("tersCumle =  " + tersCumle);


    }

}

