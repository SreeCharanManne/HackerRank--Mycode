class PrintString{
    
    // Function to find the character in patt which is present in str at min index
    public static StringBuffer printMinIndexChar(String str, String patt){
        
        // Your code here
        
        // you don't need to print anything
       StringBuffer sb=new StringBuffer("$");
       int[] a = new int[1000];
       for(char c:patt.toCharArray())
       a[c]=1;
       for(char c:str.toCharArray())
       if(a[c] != 0){
       sb =new StringBuffer(c+"");
       break;}
// you don't need to print anything
return sb;
        
    
    }
    
}
