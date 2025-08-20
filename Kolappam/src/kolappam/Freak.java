package kolappam;

public class Freak {

    public static void main(String[] args) {
        String value = "AABBCDDEEE";

        int a[] = new int[26];

        for (int i = 0; i < value.length(); i++) {
            a[value.charAt(i) - 'A']++;
        }
        
            
        for (int j = 0; j < 26; j++) {

            char c = (char) (j + 'A');
            
            if(a[j]>0){
            
            System.out.print(c + "" + (a[j]-1));
            }

        }

    }
}
