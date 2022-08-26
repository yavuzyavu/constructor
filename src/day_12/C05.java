package day_12;

public class C05 {
    public static void main(String[] args) {
      int fiat=10;
      if (fiat<10){
          System.out.println("ucuz");}
      else if (fiat<20){
          System.out.println("normal");}
      else {
          System.out.println("pahali");}
      String result= (fiat<10) ? "ucuz" : fiat<20 ? "normal" : "pahali"; }


}
