package practice;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5};
        int b[] = {9, 3, 4, 5, 6, 7};
        
        int c[] =new int[a.length+b.length];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<a.length && j<b.length){
        
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        
        while(i<a.length){
        c[k++] = a[i++];
        }
        
        while(j<b.length){
        c[k++] = b[j++];
        }
        
        System.out.println(Arrays.toString(c));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(int a[],int b[]){
     int result[] = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            result[k++] = a[i++];
            result[k++] = b[j++];
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }
        System.out.print("[");
        for (int h = 0; h < result.length; h++) {
            if (h == result.length - 1) {
                System.out.print(result[h]);
            } else {
                System.out.print(result[h] + ",");
            }
        }
        System.out.print("]");

    
    }

}
