package practice;

import java.util.Arrays;

public class StingFrequency {

    public static void main(String[] args) {
        
       // smallLetterFrequency("aaccddefgg");
        capitalFrequency("AAABCCED");

    }

    public static void smallLetterFrequency(String input) {

        int ar[] = new int[26];

        for (int i = 0; i < input.length(); i++) {
            ar[input.charAt(i) - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            char c = (char) (j + 'a');
            if (ar[j] != 0) {
                if (ar[j] - 1 != 0) {
                    System.out.print(c + "" + (ar[j] - 1));
                } else {
                    System.out.print(c);
                }
            }
        }
    }

    public static void capitalFrequency(String input) {
        int ar[] = new int[26];

        for (int i = 0; i < input.length(); i++) {
            ar[input.charAt(i) - 'A']++;
        }

       // System.out.println(Arrays.toString(ar));

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'A');
            System.out.println(c + " = " + ar[i]);
        }

    }

}


