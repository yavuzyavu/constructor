package day25_consructor;

public class Car {
    /*
    bu class bizim kaliphanemiz
    bir araba olusturmak ucun uhtuyacimiz olan
    variable ve methodlari bu class da belirleriz

        sonra farkli class larda araba olusturmamiz gerekirse
        bu class dan bir obje olusturup burada belirlenen variable ve
        methodlara gore araba uretir
     */
   public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
   public int yil;
   public int fiyat;


   public void benzinliArac(){
       System.out.println("bu arac benzinli motora sahiptir");

   }
public void maxHiz(int hiz){
    System.out.println("Bu araba max"+hiz+ "km hiz yapar");
}
}

