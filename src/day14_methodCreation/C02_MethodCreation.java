package day14_methodCreation;

import day13_MethodCreatıon.C04_MethodCreatıon;

public class C02_MethodCreation {
    public static void main(String[] args) {
        int input=666;
        rakamlariTopla(input);



    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        System.out.println("girdiginiz "+temp+" sayisinin rakamlar toplami:"+rakamlarToplami );






    }
}
