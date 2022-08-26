package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now();
        System.out.println(time1);//19:13:18.689170300

        /*
        bizim olusturduğumuz date ve time canli saat veya tarih
        degildir. LocalTime.now(); kullandigimiz satirda o anki tarih veya saati
        alip bizim öariable mize store eder.
        time 1 variable

         */
        Thread.sleep(3000);

        time1=LocalTime.now();

    }
}
