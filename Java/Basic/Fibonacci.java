import java.util.Scanner;

public class Fibonacci {
    //A series of numbers in which each number is the sum of the two preceding numbers is known as a Fibonacci Series.
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms you want in the Fibonacci series:");
        int num = sc.nextInt();

        int a=0, b = 1;
        System.out.print(a + " " + b + " ");
        sc.close();

        int nextTerm;

        for(int i = 2; i < num; i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " ");
        }
    }
}
