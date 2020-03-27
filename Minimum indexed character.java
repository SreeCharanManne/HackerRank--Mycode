class PrintString{
    
    // Function to find the character in patt which is present in str at min index
    public static StringBuffer printMinIndexChar(String str, String patt){

       StringBuffer sb=new StringBuffer("$");
       int[] a = new int[26];
       for(char c:patt.toCharArray())
       a[c-'a']=1;
       for(char c:str.toCharArray())
       if(a[c-'a'] != 0){
       sb =new StringBuffer(c+"");
       break;}
return sb;
        
    
    }
    
}
