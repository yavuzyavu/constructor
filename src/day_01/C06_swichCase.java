package day_01;

public class C06_swichCase {
    public static void main(String[] args) {
        String input = "pazartesi";
        switch (input) {
            case "pazaratesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lutfen gecerli bir gun giriniz");
        }
    }
}


