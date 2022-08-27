package SirinleCalis.oop;

public class oop01 {
    public static void main(String[] args) {
        String name ="Java Dunyasi cok guzel";//0(n) --> 0 (n/2)
        System.out.println(reverse(name));

    }

    public static String reverse(String name){
        String str2="";
//      StringBuilder str2 = new StringBuilder();
//        String [] str = name.split("");
//        for (int i = str.length-1; i >=0 ; i--) {
//
//            str2.append(str[i]);
//
//        }return str2.toString();
        String [] str = name.split("");
        String tmp = "";

        for (int i = 0; i < str.length; i++) {

            String start =str [i];
            String end = str [str.length -(i+1)];
            //if(start == end) break;
            tmp = start;
            start=end;
            end=tmp;
            str2= str2+start;
            System.out.println(str2);



        }
        return str2;
    }
}
