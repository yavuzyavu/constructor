package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        int toplam=0;


        for (int i = 1; i <=5 ; i++) {
            toplam += i;
        }

        System.out.println("toplam:" +toplam);
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
        toplam+=i;

    }
        System.out.println("toplam1:" +toplam);
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;

        }
        System.out.println("toplam2:" +toplam);
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if(i%2==0){
           toplam=toplam+i;
            }
            }System.out.println("toplam2:" +toplam);

            toplam=0;
            for (int j = 1500; j <=1600 ; j++) {
                if (j%7==0){
                    toplam+=j;}

            }
            System.out.println("1500 - 16000 arasi 7 ile bolunebilen sayilarin toplami:"+ toplam);

        }


}
