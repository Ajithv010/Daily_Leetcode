class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String result="";

        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
        
        if(Character.isLetterOrDigit(ch)){
            result=result+ch;
        }
        }
        int left=0;
        int right=result.length()-1;

        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }}
     
        
    
