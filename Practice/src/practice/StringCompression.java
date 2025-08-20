package practice;

public class StringCompression {
    
    public static void main(String[] args) {
        String input = "aabcccdde";
        
        StringBuilder output = new StringBuilder();
        
        for(int i=0;i<input.length();i++){
        
            int count=0;
            
            for(int j=i+1;j<input.length();j++)
            {
                
            if(input.charAt(i)==input.charAt(j)){
            count++;
            }
            
            }
            
            System.out.println(count);
            
        }
        
    }

}
