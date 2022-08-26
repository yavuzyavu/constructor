package calımax;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        System.out.println("\" Hello \", \"World \\ // \"");
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
        System.out.println("\"Java\" ile hayat cok \"afilli\"");
        System.out.println("\"Zaruret\" insani \n\'kasif\'yapar\n\n\n\t\"TechProEd ile java cok...\" kolay");

        double s1=23.4;
        double s2=24.0;
        double s3=12;
        double s4=450.3;
        double s5=23000;
        double top= s1+s2+s3+s4+s5;
        double ort=top/5;
        System.out.println(ort);


        int gallon=1000;
        double litre= gallon*3.785;
        String sonc= gallon +"gallon degeri"+litre+ "litreye esittir";
        System.out.println(sonc);
        int lt= 100;
        double g= lt/3.785;
        System.out.println(lt+ "gallon degeri" +g+ "litreye esittir");
        Scanner scan= new Scanner(System.in);
        System.out.print("fahrenayt degerini giriniz:");
        int fh=scan.nextInt();
        System.out.println("girdiginiz fahranayt degeri : "+ (fh-32)*5/9+ " santigrat derecedir");




    }




    }

