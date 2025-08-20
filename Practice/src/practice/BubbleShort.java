package practice;

import java.util.Arrays;

public class BubbleShort {
     public static void main(String[] args) {
         int ar[]={3,6,8,9,1,12,34};
         System.out.println(Arrays.toString(shorting(ar)));         
     }

    private static int[] shorting(int[] arr) {
    
        for(int i=0;i<arr.length;i++){
            
           for(int j=0;j<arr.length - 1;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]   = arr[j+1];
                arr[j+1] = temp;
                }
           }
        }
        return arr;
        
    }
}