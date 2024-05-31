// 10. Kadane's Algorithm Max of sub - Arrays

// Used to find the max sum too
// If sum becomes negative then replace with 0
// It will use single loop therefore Time complexity becomes O(n)


public class ArrayCC {

    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;     //ms=MaxSum
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max Sum using Kadane's Algo is : " + ms);
    }


    public static void main(String[] args) {

        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        kadanes(number);
    }
}
