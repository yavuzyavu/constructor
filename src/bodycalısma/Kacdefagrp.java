package bodycalısma;

public class Kacdefagrp {
    public static void main(String[] args) {

        String word="abcabqcabc";
        String karakter="q";

        int ilkuzunluk=word.length();
        System.out.println(ilkuzunluk);
        int snuz= word.replace("karakter","").length();
        System.out.println(snuz);
        System.out.println("bu ifadedeki "+ karakter+" karakterinin sayisi: "
                +(ilkuzunluk-snuz));
    }
}
