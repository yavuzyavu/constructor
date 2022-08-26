package SirinleCalis.t;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sirala {
    public static void main(String[] args) {

        Integer arrint[]= {1232,1134,2345,1022};

        List<Integer> sayilar= new ArrayList<>(Arrays.asList(arrint));

        Collections.sort(sayilar);

        System.out.println(sayilar);

        String [] cumle= {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        List<String> aaa=new ArrayList<>(Arrays.asList(cumle));
        
        Collections.sort(aaa);
        System.out.println("aaa = " + aaa);
        
        



    }
}
