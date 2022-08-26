package day26_Counstructor;

public class Araba {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){

    }
    /*
    biz herhangi bir constructor olusturdugumuzda
    java default constructor i siler
    eger biz  projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine parametresiz bir counstructor
    olusturmaliyiz
     */


    public void benzinliArac(){System.out.println("bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println();
    }




}
