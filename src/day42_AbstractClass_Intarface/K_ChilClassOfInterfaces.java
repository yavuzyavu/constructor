package day42_AbstractClass_Intarface;

public class K_ChilClassOfInterfaces implements I02_Interfaces,I03_Interfaces{

     /*
      Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
      implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */

    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);//20
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(ISIM);//Yildiz Koleji

    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
