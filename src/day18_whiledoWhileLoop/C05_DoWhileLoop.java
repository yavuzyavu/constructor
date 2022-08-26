package day18_whiledoWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        int bas=9;
        int bitis=190;

        int temp= bas;
        while (temp<bitis){
            if(temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
//do while loo ile yapalim
        System.out.println("");
        temp=bas;


        do {if(temp%7==0){
            System.out.print(temp+" ");
        }
        temp++;
        }while (temp<bitis);


    }
}
