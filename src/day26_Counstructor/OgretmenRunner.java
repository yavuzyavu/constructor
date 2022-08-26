package day26_Counstructor;

public class OgretmenRunner {
    public static void main(String[] args) {
            Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen1"+ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Muhammed Yusuf","Kadioglu","12/06/2012","Matematik","Fen Bilgisi");
        System.out.println("Ogretmen 2 "+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Yusuf","Kadioglu","12/06/2012");
        System.out.println("Ogretmen3"+ogretmen3);




    }
}
