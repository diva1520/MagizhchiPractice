package practice;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcacbabd";
        String r = "";

        
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
            for(int j=0;j<s.length();j++){
                 if(c != j ){
                     for(int k=r.length();k>0;k--)
                     {
                         if(c != j)
                     r+=s.charAt(j);
                     }
                 
                 }
            
            }
        }
        System.out.println(r);
    }

}
