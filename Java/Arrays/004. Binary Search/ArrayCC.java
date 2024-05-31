// Largest Number;
//import java.util.*;

public class ArrayCC {
    private static int binarySearch(int[] number, int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] Number = { 1, 2, 3, 4, 5, 6 };
        int key = 5;

        int result = binarySearch(Number, key);
        System.out.println("Index for key is : " + result);
    }

}