class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() == k) return true;
        if(s.length() < k) return false;
        int c[]=new int[26];
        for(char i:s.toCharArray()){
            c[i-'a']++;
        }int cnt=0;
        for(int i:c){
            if(i%2==0){}
            else{cnt++;}
           
        }
        return cnt<=k;
    }
}
