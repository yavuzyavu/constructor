package day21_Arrays;

public class C02_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {
        //verilen String bir array de en uzun ve
        //en kisa string leri yazdiran bir method olusturun
    String [] isimler={"yusuf","abdullah","muhammed571","hatice"};
    enUzunVeEnKisayiYazdir(isimler);


    }

    public static void enUzunVeEnKisayiYazdir(String[] isimler) {
        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i <isimler.length; i++) {
                if(isimler[i].length()>enUzunKelime.length()){
                    enUzunKelime=isimler[i];

                }
            if(isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];

            }



        }
        System.out.println("enUzunKelime:"+enUzunKelime);
        System.out.println("enKisaKelime:"+enKisaKelime);




    }
}
