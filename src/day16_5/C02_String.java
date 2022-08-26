package day16_5;

import java.util.Scanner;

public class C02_String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("string1 :");
        String str1=scanner.nextLine();

        System.out.println("string2");
        String str2=scanner.nextLine();

        System.out.println("1.yontem:" + str1 + " "+str2);
        System.out.println("2.yontem:" + str1.concat( " "+str2));

        String str1_0indextenSonrasi=str1.substring(1);
        String str2_0indextenSonrasi=str2.substring(1);

        System.out.println("manipulationdan sonraki hali:"+ str1_0indextenSonrasi+" " +
                str2_0indextenSonrasi);
    }
}
