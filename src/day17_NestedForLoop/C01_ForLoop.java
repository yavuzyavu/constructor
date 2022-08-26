package day17_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        String input="Java her zaman guzel";
//verilen string teki kullanilan harfleri terarsiz olarak yazdirip
// kelimede kullanilan farli harf sayisini veren bir metod yaziniz
        tekrarsizYap(input);



    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W", "");
        System.out.print(islenecekKelime.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);
        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(","+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("input:"+input);
        System.out.println("benzersizInput:"+benzersizInput);
    }
}
