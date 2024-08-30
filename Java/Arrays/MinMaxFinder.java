public class MinMaxFinder {

    public static int Min(int[] A, int N) {
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    public static int Max(int[] A, int N) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] A = { 4, 2, 5, 8, 6 };
        int N = A.length;
        System.out.println("Minimum Number is : " + Min(A, N));
        System.out.println("Minimum Number is : " + Max(A, N));
    }
}
