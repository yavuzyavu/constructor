package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_arraydenArrayListYapmak {
    public static void main(String[] args) {

        String [] arr={"Ismail,Nurullah,Fatih"};
        /*
        uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerinee array olusturup, bunlari list e cevirmek daha pratik olabilir
        1- loop ile array deki tum elementleri liste atabiliriz
        2- Arrays.asList() kullanabiliriz
        Ancak bu method un 2 tane kotu yan etkisi var
            - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
            dolayisi ile list'te olan add, remove gibi size'i diegistiren methodlar bu
            sekilde olusturulan listlerde kullanilamaz
            - kaynak olan array ile urun olan list ozdeslestirilir
            birinde yapilan degisiklik, otomatik olarak digerine de islenir
  */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail,Nurullah,Fatih]

        //1. yah etki:
        //sinifList.add("Erdi");//UnsupportedOperationException
        //sinifList.remove(1);//UnsupportedOperationException

        //2. yan Etki:

        arr[1]= "Emre";
        System.out.println("degisim sonrasi array:"+Arrays.toString(arr));
        System.out.println("Array'i degistirince list:"+sinifList);

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list:"+sinifList);
        System.out.println("List'i degistirince Array: "+Arrays.toString(arr));





    }
}
