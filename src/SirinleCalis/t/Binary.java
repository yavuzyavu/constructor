package SirinleCalis.t;

public class Binary {
    public static void main(String[] args) { 
        /*Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010
            ​
    Beklenen Çıktı:
            1010100
           */
        String num1="100010";
        String num2="110010";

        int num=Integer.parseInt(num1,2);
        System.out.println("num = " + num);

        int numm=Integer.parseInt(num2,2);
        System.out.println("num = " + numm);

        System.out.println(Integer.toBinaryString(num+numm));

        System.out.println(KacSaniye.Kacsaniye(3));

    }
  
    







}
