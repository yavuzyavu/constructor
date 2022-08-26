package day29_pasBayValue_immutable;

import java.util.Locale;

public class C05_ImmuTable {

    public static void main(String[] args) {

        String isim="Mine";

        isim= isim.toUpperCase();

        System.out.println(isim); //MINE (referans ayni kalip obje degistigi icin
        // kalici olarak degisir.[bu yan etkisidir]

        isim="Mevlut";

        for (int i = 0; i <100; i++){
            isim+=".";

        }
        System.out.println(isim);//19. satirda atama var

        }
    }

