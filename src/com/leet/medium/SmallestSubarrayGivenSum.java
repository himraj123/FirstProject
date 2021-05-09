package com.leet.medium;

public class SmallestSubarrayGivenSum {

    public static void main(String[] args) {
        int [] arr=new int[]{4,2,2,2,1,1,2,3,4};
        int target=8;
        System.out.println(smallestSubarray(arr,target));
    }

    public static int smallestSubarray(int [] arr,int target){
        int currentSum=0;
        int start=0;
        int minWindowSize=Integer.MAX_VALUE;

        for(int end=0;end<arr.length;end++){
            currentSum+=arr[end];
            while(currentSum>=target){
                minWindowSize=Math.min(minWindowSize,end-start);
                currentSum-=arr[start];
                start++;
            }
        }
        return minWindowSize+1;
    }
}
