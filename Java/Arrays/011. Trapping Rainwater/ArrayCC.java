// 011. Trapping Rainwater

//Apna college DSA Sheet = Que 22 medium level

//https://leetcode.com/problems/trapping-rain-water/

// Given n Non negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

//Uses  Auxilliary Arrays

public class ArrayCC {
    
    public static int trappedRainwater(int height[]){   // O(n)
        int n = height.length;

        //calculate left max boundary = array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1] );
        }

        // calculate right max boundary = array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
            // WaterLevel = min(leftMax bound, rightMax bound)
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            
            // trapped water = waterlevel - height[i]
            trappedWater += WaterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.print(trappedRainwater(height));
    }
}
