class Solution {
    public String breakPalindrome(String p) {
         if(p.length()<=1)return "";
        String s="";
        for(int i=0;i<p.length()/2;i++){
            if(p.charAt(i)!='a'){
                s=p.substring (0,i)+'a'+p.substring(i+1,p.length());
                return s;
            }
        }
         s=p.substring(0,p.length()-1)+'b';
         return s;
        
    }
}
