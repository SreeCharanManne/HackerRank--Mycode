import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); 
        while(t-->0){
            int x=Integer.parseInt(br.readLine());
            System.out.print("0 ");
            TreeSet<Integer> hs=new TreeSet<Integer>(); 
            for(int i=1;i<=9 && i<=x;i++){
                
                help(i,x,hs);
            }
            for(int h:hs){
                System.out.print(h+" ");
            }
            System.out.println();
        }
	 }
	 public static void help(int i,int x,TreeSet<Integer> hs){
	     Queue<Integer> q=new LinkedList<Integer>();
	     q.add(i);
	     while(!q.isEmpty()){
	        int num=q.poll();
	        if(num<=x){
	            hs.add(num);
	            int rem=num%10;
	            if(rem==0){
	                q.add(num*10+1);
	            }
	            else if(rem==9){
	                q.add(num*10+8);
	            }
	            else{
	                q.add(num*10+rem+1);
                    q.add(num*10+rem-1);
	            }
	        }
	     }
	 }
}
