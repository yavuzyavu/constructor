package day_2806;

public class C05_swichCase {
    public static void main(String[] args) {
        String gun = "sali";
        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi");
                break;
            case "carsamba":
            case"cumartesi":
                System.out.println("Sql dersi");
                break;
            case"persembe":
            case"cuma":
                System.out.println("selenyum dersi");
                break;
            default:
                System.out.println("izin günü");
        }
    }
}
