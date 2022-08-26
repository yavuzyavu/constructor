package gurup_calisma;

import java.util.ArrayList;
import java.util.List;

public class ListGrup {
    public static void main(String[] args) {
        /* Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
​ Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
   */
        String[] simge = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> yenismg = new ArrayList<>();


        for (int i = 0; i < simge.length; i++) {
            yenismg.add(simge[i]);
            System.out.println("yenismg = " + yenismg);


        }
        for(String each:simge){
            yenismg.add(each);
        }
        System.out.println("yenismg = " + yenismg);
    }
    
}
