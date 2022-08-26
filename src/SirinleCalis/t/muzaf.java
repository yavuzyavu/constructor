package SirinleCalis.t;

import java.util.Scanner;

public class muzaf {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String sifre="Hak21...";
        int girisSayisi= 3;





        while (true){
            System.out.println("sifre gir");
            String girilenSifre=scan.nextLine();

            if(sifre.equals(girilenSifre)){
                System.out.println("sifre basarili");
                break;
            }else{
                System.out.println("sifre yanlis");
                girisSayisi--;

                System.out.println("kalan giris hakkin"+ girisSayisi);
            }

            if(girisSayisi==0){
                System.out.println("giris hakkin kalmadi kart bloke");
            }
        }
    }
}
