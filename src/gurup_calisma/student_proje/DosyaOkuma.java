package gurup_calisma.student_proje;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DosyaOkuma {
    public static Map<String, String> dersvevKodlariniOkuma() throws IOException {
        Map<String, String>derslerveKodlari=new HashMap<>();
        BufferedReader reader=new BufferedReader(new FileReader("src/sinav/courses.csv"));
        String line="";
        while( (line=reader.readLine()) != null ) {
            String[] arr=line.split(",");
            derslerveKodlari.put(arr[0], arr[1]);

        }
        return derslerveKodlari;

    }public static Map<String,Ogrenci> ogrencivealdigiDersleriOkuma() throws IOException {
        Map<String,Ogrenci>ogrenciveDersleri=new HashMap<>();
        BufferedReader reader=new BufferedReader(new FileReader("src/sinav/studentCourse.csv"));
        String line="";
        while( (line=reader.readLine()) != null ) {
            String[] arr=line.split(",");
            ogrenciveDersleri.put(arr[0], new Ogrenci(arr[1], arr[2]));
        }return ogrenciveDersleri;
    }
    public static List<String> ogretmenListiOlusturma() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/sinav/teachers.csv"));
        List<String> ogretmenList = new ArrayList<>();
        String line = "";
        while ((line = reader.readLine()) != null) {
            ogretmenList.add(line);
        }

        return ogretmenList;

    }
}
