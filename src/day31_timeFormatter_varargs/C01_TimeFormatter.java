package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih:"+tarihSaat);

        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("dd/M/yy  hh:mm a");

        System.out.println(dtf1.format(tarihSaat));

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("d/MMM/yy  HH:mm a");

        System.out.println(dtf2.format(tarihSaat));



    }


}
