//package Basics;
import java.util.Scanner;

public class Strings{
    
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Scanner basics
        // System.out.println("Enter a Name: ");
        // String name;
        // name = sc.nextLine();
        // System.out.println("Name Entered : " + name);
        // System.out.println("Name has : "+ name.length() + " letters");

        //Contatenation
        String firstname = "Naresh";
        String lastname = "Lokhande";
        String fullName = firstname + " " + lastname;
        System.out.println("Fullname is : " + fullName);

        //CharAt
        //System.out.println(fullName.charAt(1));

        printletters(fullName);

        sc.close();
    }
}