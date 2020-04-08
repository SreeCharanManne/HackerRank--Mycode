import java.io.*;
import java.math.*;


public class Solution {

    // Complete the larrysArray function below.
static String larrysArray(int[] A) {
     if( (getInvCount(A) % 2)!=1){
    return "YES";}
    return "NO";
    }
public static int getInvCount(int a[]){
int count = 0;
for(int i = 0; i < a.length-1; i++){
    for(int j = i + 1; j < a.length; j++){
        if(a[i] > a[j]){
            count++;
        }
    }
}
return count;
}



 
