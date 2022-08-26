package SirinleCalis.Sirin0106;

public class C03_String {
    public static void main(String[] args) {
        String a = "$12.99";
        String b = "$35.99";
        String a1=a.replaceAll("\\W","");
        System.out.println("a1 = " + a1);
        String b1= b.replaceAll("\\W","" );
        System.out.println("b1 = " + b1);
        double c=(Double.valueOf(a1)+ Double.valueOf(b1))/100;
        System.out.println("c = " + c);

    }
}
