package SirinleCalis;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir tam sayi girin");
        int sayi=scan.nextInt();


        for (int i = 0; i <=sayi ; i++) {
            if(i%5==0 || i%3==0){
                System.out.print(i+" ");

            }




        }
    }
}
