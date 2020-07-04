import java.util.*;
import java.lang.*;
import java.io.*;
class input
{
	int start;
	int end;
	int pos;
	input(int s, int e, int p)
	{
		start = s;
		end = e;
		pos = p;
	}
}
class GFG
 {
	public static void main (String[] args) throws IOException
	{
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(bf.readLine());
	    while(t-- > 0)
	    {
	        int n = Integer.parseInt(bf.readLine());
	        ArrayList<input> al = new ArrayList<input>();
	        String s[] = bf.readLine().trim().split(" ");
	        String f[] = bf.readLine().trim().split(" ");
	 
	        for(int i=0 ; i<n ; i++)
	        {
	            input obj = new input(Integer.parseInt(s[i]), Integer.parseInt(f[i]), i);
	            al.add(obj);         
	        }
	        Collections.sort(al,(input x,input y)->x.end-y.end);
	        
	        
	        StringBuffer sb = new StringBuffer();
	        Integer last = -1;
	        int ind = 0;
	        for(int i=0 ; i<al.size() ; i++)
	        {
	            if(last == null)
	            {
	                last = al.get(i).end;
	                sb.append(al.get(i).pos+1 + " ");
	            }
	            else
	            {
	                if(al.get(i).start >= last)
	                {
	                    last = al.get(i).end;
	                    sb.append(al.get(i).pos+1 + " ");
	                }
	            }
	            
	        }
	        System.out.println(sb);
	    }
	 }
}
