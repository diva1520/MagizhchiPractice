package practice;

public class RemoveDulicateChars {

    public static void main(String[] args) {

        String value = "m ad am";
        String value1 = remveSpace(value);

        int ar[] = targetIndex(value1);

        String result = removeDuplicate(ar, value1);

        System.out.println(result);

    }

    public static String removeDuplicate(int target[], String value1) {
        String result = "";
        char[] cr = value1.toCharArray();

        for (int f : target) {
            if (f != 0) {
                cr[f] = ' ';
            }
        }

        for (char cd : cr) {
            if (cd != ' ') {
                result += cd;
            }
        }
        return result;
    }

    public static String remveSpace(String value) {
        String value1 = "";
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            if (c != ' ') {
                value1 += c;
            }

        }

        return value1;

    }

    public static int[] targetIndex(String value1) {
        int ar[] = new int[value1.length()];
        char c;

        for (int i = 0; i < value1.length(); i++) {
            c = value1.charAt(i);

            for (int j = i + 1; j < value1.length(); j++) {
                if (c == value1.charAt(j)) {
                    ar[i] = j;
                    break;
                }
            }
        }

        return ar;
    }
}
