public class Smallest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 5, 54, 1, -5};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
