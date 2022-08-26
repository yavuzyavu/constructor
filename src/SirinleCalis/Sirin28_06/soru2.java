package SirinleCalis.Sirin28_06;
public class soru2 {
    /*
     Create 3 String variables for people's names. Print the sum of the number of characters in
     all the 3 names except space characters.
     Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
     */
    public static void main(String[] args) {
        String name1 = "Ali C a n ";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";
        int name1Lenght = name1.replaceAll("\\s","").length();
        int name2Lenght = name2.replaceAll("\\s","").length();
        int name3Lenght = name3.replaceAll("\\s","").length();
        int totalLenght = name1Lenght+name2Lenght+name3Lenght;
        System.out.println(totalLenght);
    }
}





