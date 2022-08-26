package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        java Entry<K,V> map'in icerisinde bulunan her bir kaydi
        K=V seklinde tutar
        dolayisiyla herhangi bir Entry'e ulastigimizda hem key'e hem de value ye ulasabilir
        ve istediğimiz islemleri yapabiliriz

        entry.getKey() bize Key i getirir
        entry.get
         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        //herbir elemani alt alta yazdirin

     Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();

     for (Map.Entry<Integer,String> each: sinifEntrySet){
         System.out.println(each);
     }

     //Map'in elemanlarinda varsa Tester kurs ismini QA olarak degistirelim

        String eachValue;
        for (Map.Entry<Integer,String> each: sinifEntrySet){

            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");

        }
        System.out.println(sinifListMap);
    }
}
