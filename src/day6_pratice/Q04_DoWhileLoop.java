package day6_pratice;

import java.util.Scanner;

public class Q04_DoWhileLoop {
    public static void main(String[] args) {
        /*
Ask user to enter a word. If the word has odd number of characters
 and has 3 or more characters,
 print the character in the middle of the word.
 the word has even number of character print "You entered wrong word."
     INPUT      :   celik
     OUTPUT    :   l
     INPUT      :   elif
     OUTPUT    :   You entered wrong word.*/
        Scanner scan=new Scanner(System.in);

        String word="";
    do {
        System.out.println("lutfen bir kelime giriniz");
        word=scan.nextLine();
        if(word.length()<3){
            System.out.println("girilen word 3 karakterden az");
        }if (word.length()%2==1&& word.length()>=3){
            System.out.println();
        }


    }while (word.length()<3);

    }
}
