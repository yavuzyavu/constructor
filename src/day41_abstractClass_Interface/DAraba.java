package day41_abstractClass_Interface;

public  abstract class DAraba {
    public static void main(String[] args) {
        /*abstract class ta main metnod opsiyoneldir(olma zorunlugu yok).
        Eger abstract class sadece child classlarin tasimak zorunda
        oldugu ozellikleri belirlemek icin olusturulduysa main method a ihtiyac olmaz
        sadece abstract methodlar olur

        ama bir abstract method'da
        standart belirlemek disinda da method'lar calisabilir
        bu durumda ihtiyac olursa main method olusturulabilir
         */
    }

    public abstract void yakit();
   public abstract void kaporta();
    public abstract void motor();
    /*
       Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
        abstract method olur ve abstract method'larin body'si olmaz
     */



    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
         /*
          abstract olmayan method'lara concrete method denir.
          abstract bir method'u abstract keyword ile belirtmek ZORUNLUDUR
          concrete method'larda bunun deklare edilmesine gerek yoktur
          biz sadece abstraction ile ilgili konustugumuzda
          abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
         */
    }

}
