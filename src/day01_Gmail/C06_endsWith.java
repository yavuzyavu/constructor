package day01_Gmail;

public class C06_endsWith {
    public static void main(String[] args) {
    String input= "abdkadioglu@gmail.com";
        if (!input.contains("gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");}
     else if (input.endsWith("gmail.com")){
            System.out.println("emailiniz kaydedildi");}
            else{
                System.out.println("lutfen yazimi kontrol ediniz");

        }


    }


}
