class Solution {
    public String largestNumber(int[] nums) {
        String s[]=new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,new Lnc());
        if(s[0].equals("0"))return "0";
        String s2="";
        for(String i:s){
            s2+=i;
        }
        return s2;
    }
        
    private class Lnc implements Comparator<String>{
        public int compare(String a,String b){
            String o1=a+b;String o2=b+a;
            return o2.compareTo(o1);
        }
    }
    
}
