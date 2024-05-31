// 7. Print Max of sub - Arrays;

public class ArrayCC {
    public static void maxSubArrays(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){  //print
                    //Sub array sum
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }  
        }
        System.out.println("Max sum of Subarrays =  " + maxSum);
    }

    public static void main(String[] args) {

        int number[] = {1, -2, 6, -1, 3}; 
        maxSubArrays(number);
    }
}
