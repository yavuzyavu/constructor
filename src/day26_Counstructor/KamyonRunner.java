package day26_Counstructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("Kamyon1 ozellikleri ="+kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Merrcedes","4140",2005,500000);
        System.out.println("kamyon2 bilgileri =" +kamyon2.toString());

        Kamyon kamyon3=new Kamyon("MAN","As900",2005,500000);
        System.out.println("kamyon3 bilgileri =" +kamyon3.toString());

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("kamyon4 bilgileri =" +kamyon4);


    }
}
