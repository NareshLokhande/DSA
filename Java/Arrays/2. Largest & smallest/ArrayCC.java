// Largest Number;
//import java.util.*;

public class ArrayCC {
    public static int getLargest(int Number[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < Number.length; i++) {
            if (Largest < Number[i]) {
                Largest = Number[i];
            }
            if (Smallest > Number[i]) {
                Smallest = Number[i];
            }
        }
        System.out.println("Smallest Nunber is : "+Smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int[] Number = {1, 2, 3, 4, 5, 6};

        System.out.println("Largest number is : "+getLargest(Number));
    }
}
