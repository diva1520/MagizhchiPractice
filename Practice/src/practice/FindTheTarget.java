package practice;

public class FindTheTarget {

    public static void main(String[] args) {

        int target = 10;

        int ar[] = {6, 2, 3, 4, 1, 8};

        int temp = 0;
        int count=0;
        for (int i = 0; i < ar.length; i++) {
            temp = ar[i];
            for (int j = i; j < ar.length; j++) {
                if (temp + ar[j] == target) {
                    System.out.print("[" + i + "," + j + "] ");
                    count++;
                    break;
                }

            }
            if(count>0){
            break;
            }
        
        }
    }
}
