public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int[] reverseArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length - i - 1];
        }

        System.out.print("Reversed with Array : ");
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void reverseArray2(int[] arr) {
        int first = 0, last = arr.length - 1;

        // Going to swap the fist and last number in an array
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        System.out.print("Revered with Swapping : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        reverseArray(array);
        reverseArray2(array);
    }
}
