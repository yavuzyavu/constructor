package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;



public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih =LocalDate.now();//2022-07-23

        System.out.println(tarih);

        System.out.println("15 satir"+tarih.getDayOfYear());
        System.out.println("16 satir"+tarih.getDayOfWeek());
        System.out.println("17 satir"+tarih.getMonthValue());
        System.out.println("18 satir"+tarih.isLeapYear());//(artik yil) false

        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println(tarih2);//2001-05-15

        LocalDate tarih3=LocalDate.of(1983, Month.APRIL,11);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20));

        System.out.println(tarih.minusDays(100).minusMonths(5));

        System.out.println("34.satir "+tarih.isAfter(tarih2));


        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }





    }
}
