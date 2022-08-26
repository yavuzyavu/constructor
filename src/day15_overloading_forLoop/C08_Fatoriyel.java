package day15_overloading_forLoop;

public class C08_Fatoriyel {
    public static void main(String[] args) {
        int input = 5;
        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {
        int faktoriyel = 1;
        if (input < 0 || input > 20) {
            System.out.println("verilen sayi icin faktoriyel hesaplanamaz");
        } else if (input == 0) {
            System.out.println("0! = 1");
        }
        else
            for (int i = 1; i <=input; i++) {
               faktoriyel*=i;
            }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
