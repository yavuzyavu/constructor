package day14_methodCreation;

import day13_MethodCreatıon.C04_MethodCreatıon;

public class C01_MethodCreation {
    public static void main(String[] args) {
terstenyazdir("sene");
        C04_MethodCreatıon.topla(6,5);
        int topla = 0;
        System.out.println(topla);
    }

    public static void terstenyazdir(String input) {
        String tersInput=input.substring(3)+input.substring(2,3)
                +input.substring(1,2)+input.substring(0,1);

        System.out.println("Verilen kelimenin tersten yazilisi:" +tersInput);


    }
}
