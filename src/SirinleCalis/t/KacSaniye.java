package SirinleCalis.t;

public class KacSaniye {
    public static void main(String[] args) {

        int saat=1;

        Kacsaniye(saat);

        System.out.println(Kacsaniye(5));
    }

    public static int Kacsaniye(int saat) {

        int sn= 60*60*saat;

        return sn;
    }
}
