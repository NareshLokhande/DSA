//Reverse Array;

public class ArrayCC {
    public static void Reverse(int arr[]){
        int first = 0, last = arr.length-1;

        // Going to swap the fist and last number in an array
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // sorted Array given

        Reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
