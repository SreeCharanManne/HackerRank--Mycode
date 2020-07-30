
import java.util.*;
class Hi{ 
    public static void main(String args[]) 
    { Scanner in=new Scanner(System.in);
	  String s="AB+CD-";
	  Stack<String>s1=new Stack<>();
	  for(char i:s.toCharArray()){
		  if(isOperator(i)){
				 String a=s1.peek();s1.pop();
				 String b=s1.peek();s1.pop();
				 s1.push(i+b+a);}
			  else{
				  s1.push(""+i);
			  }
		  }
		  for(String i:s1)
	        System.out.print(i);
        
	}
	public static boolean isOperator(char i){
		 if(i=='*'||i=='+'||i=='-'||i=='/')
		 return true;
		 else
		 return false;
	} 
} 
