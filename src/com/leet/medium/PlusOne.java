package com.leet.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int [] plusOne(int [] arr){
        int k=arr.length-1;
        while(k>0){
            if(arr[k]==9){
                arr[k]=0;
            }
            else{
                arr[k]=arr[k]+1;
                return arr;
            }
            k--;
        }

        int [] newArr= Arrays.copyOf(arr,arr.length+1);
        //int [] newArr=new int[arr.length+1];
        newArr[0]=1;
        return newArr;

       /* while(k>=0 && arr[k]==9){
            arr[k]=0;
            k--;
        }
        if(k>=0) {
            arr[k] = arr[k] + 1;
            return arr;
        }

            int [] newArr= Arrays.copyOf(arr,arr.length+1);
            //int [] newArr=new int[arr.length+1];
            newArr[0]=1;
            return newArr;*/

    }
}
