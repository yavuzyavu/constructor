package day18_whiledoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        int input= 545832;
        int raktp=0;
        int birbas=0;
        int temp=input;

        while (temp>0){

            birbas=temp%10;
            raktp+=birbas;
            temp /=10;

        }
        System.out.println(input+ " sayisinin rakamlar toplami " +raktp);
    }
}
