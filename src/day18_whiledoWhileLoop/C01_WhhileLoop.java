package day18_whiledoWhileLoop;

public class C01_WhhileLoop {
    public static void main(String[] args) {
        char ilkHarf= 'f';
        char sonHarf='t';

        char temp= ilkHarf;
        String buyult= "";

        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();

            System.out.print(buyult + " ");
            temp+=1;
        }
    }
}
