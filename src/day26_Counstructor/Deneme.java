package day26_Counstructor;
public class Deneme {
    int x=5;

    Deneme(){
        System.out.print("-x"+x);
    }


    Deneme(int x){
        this();
        System.out.print("-x"+x);
    }

    public static void main(String[] args) {
        Deneme mc1 = new Deneme(4);
        Deneme mc2=new Deneme();
    }
}
