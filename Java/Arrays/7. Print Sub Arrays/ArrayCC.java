// 7. Print Sub Arrays;

public class ArrayCC {
    public static void printSubArrays(int number[]){
        int total = 0;

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){  //print
                    System.out.print(number[k]+" ");    //subarray
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays =  " + total);
    }

    public static void main(String[] args) {

        int number[] = {1,2,3,4,5,6}; 
        printSubArrays(number);
    }
}
