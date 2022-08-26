package day13_MethodCreatıon;

public class C04_MethodCreatıon {
    public static void main(String[] args) {
        //input olarak verilen iki int. toplayip sonucunu yazdiran bir method olusturun.
        int input1= 10;
        int input2= 40;
       /* method 4 adimda olusur
       1.method call
       2. adim argument eklenmesi gerekiyorsa ekleyelim
       eger methodun return teype void den farkli olacaksa bir
        variable olusturup,methor call,u assign edelim
        
        */
            topla(input1 , input2);
            




           }

    public static void topla(int input1, int input2) {
     /* 3. adim method deklarasyonunda degistirilmesi gereken
     bolumleri degistirir.(accsess modifier,return Type vb..)
     return keywor u ve donecek  degeri hesaplamaliyiz
      */
        System.out.println("girilen iki sayinin toplami:" +(input1+input2));
    }
}
