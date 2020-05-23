import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int g=0;g<t;g++){
		    int rows=sc.nextInt();
		    int col=sc.nextInt();
		    int gold[][]=new int[rows][col];
		    for(int r=0;r<rows;r++)
		      for(int c=0;c<col;c++)
		        gold[r][c]=sc.nextInt();
		    int store[][]=new int[rows][col];
		    for(int r=0;r<rows;r++)
		      for(int c=0;c<col;c++)
		        store[r][c]=-1;
		    int max=-1;
		    for(int i=0;i<rows;i++) //maximum gold available in the last col
		        max=Math.max(dp(rows-1,col-1,i,col-1,store,gold),max);
		        
		    System.out.print(max);
		    System.out.println();
		}//end of test case
	}
	static int dp(int rmax,int cmax,int cr,int cc,int store[][],int gold[][]){
	    if(cr<0||cc<0||cr>rmax||cc>cmax)
	      return(0); //out of the matrix no gold
	      if(store[cr][cc]!=-1)
	        return(store[cr][cc]); //precomputed
	          if(cc==0){
	        store[cr][cc]=gold[cr][0]; //for first col minimum gold for any
	        return(store[cr][cc]);  //row is the value at that index
	    }
	      int max=-1;
	     for(int i=cr-1;i<=cr+1;i++)
	         max=Math.max(dp(rmax,cmax,i,cc-1,store,gold)+gold[cr][cc],max);
	      store[cr][cc]=max;
	      return(max);
	}
}//end of class
