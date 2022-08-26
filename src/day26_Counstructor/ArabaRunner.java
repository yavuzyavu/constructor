package day26_Counstructor;

import day25_consructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        //bir gun onceki Car classindan obje olusturalim
        //farkli bir package deki bir class tan obje olusturdugumuzda
        //access modifier lari da dikkate almaliyiz

        Car car1 =new Car();
        System.out.println(car1.fiyat);
        /*
        araba class'indan bir obje olusturdugumda
        eger default constructor kullanildiysa
        tum ozellikler icin tektek deger atamak zorunda
        kaliriz
         */

        Araba araba1=new Araba();
        araba1.fiyat=100000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("Marka:"+araba1.marka+"\nModel:"+araba1.model+"\nYil:"+araba1.yil+
                "\nFiyat:"+araba1.fiyat);

        /*
        Eger bir objeyi olustururken bazi ozelliklerini
        argument olarak belirtip o ozelliklerde bir argument olusturmak
        istersek java itiraz eder
        Cunku her class ta constructor vardir ama o da parametresizdir
        bizim yeni ve parametreli constructor(lar)'a ihtiyacimiz vardir
         */
        Araba araba2=new Araba("BMW","5.20",2011,15000);
        System.out.println("Marka:"+araba2.marka+"\nModel:"+araba2.model+"\nYil:"+araba2.yil+
                "\nFiyat:"+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println("Marka:"+araba3.marka+"\nModel:"+araba3.model+"\nYil:"+araba3.yil+
                "\nFiyat:"+araba3.fiyat);

        Araba araba4=new Araba("Audi","A5",2020,780000);
        System.out.println("Marka:"+araba4.marka+"\nModel:"+araba4.model+"\nYil:"+araba4.yil+
                "\nFiyat:"+araba4.fiyat);






    }
}
