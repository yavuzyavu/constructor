package day38_Exception;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a=1000;
        int b=50;
        int sayac=1;

        while (sayac<100){

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu dikkatli ol");
            }
            b--;
            sayac++;
        }


    }



    }



