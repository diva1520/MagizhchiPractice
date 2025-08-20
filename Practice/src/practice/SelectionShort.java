package practice;

import java.util.Arrays;

public class SelectionShort {

    public static void main(String[] args) {
        int ar[] = {33, 38, 9, 10, 12, 6};

        for (int i = 0; i < ar.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            System.out.println(Arrays.toString(ar));
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;

        }
        // System.out.println(Arrays.toString(ar));
    }

}
