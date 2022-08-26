package SirinleCalis.Sirin0106;

public class C06_String {
    public static void main(String[] args) {
       String cml= "Wow! Ali is 13 years, old, but,,,, he is a university student.";
        String cyl= cml.replaceAll("\\s","");
        String mkt= cyl.replaceAll("\\w" ,"");
        System.out.println( mkt.length());


    }
}
