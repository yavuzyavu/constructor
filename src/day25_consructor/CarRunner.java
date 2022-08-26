package day25_consructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Marka:"+car1.marka+"\nModel:"+car1.model+"\nYil:"+car1.yil+
                "\nFiyat:"+car1.fiyat);
        System.out.println("");
        Car car2=new Car();
        System.out.println("Marka:"+car2.marka+"\nModel:"+car2.model+"\nYil:"+car2.yil+
                "\nFiyat:"+car2.fiyat);

        /*
        herhangi bir obje uzerinde bir variable yazdirmaya calistigimizda java değeri su
        siralama ile arar
        1- o obje olusturduktan sonra bir deger atandi mi?
        2- Objenin olusturuldugu class ta variable'a bir deger atanmis mi bakar
        3- O zaman data turune gore Java default degeri atar

         */
    }
}
