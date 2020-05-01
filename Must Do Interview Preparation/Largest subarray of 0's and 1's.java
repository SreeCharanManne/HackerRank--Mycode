// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            GfG g = new GfG();
            int n = g.maxLen(a);

            System.out.println(n);

            T--;
        }
    }
}
// } Driver Code Ends

class GfG {
    /*You are required to complete this method*/
    int maxLen(int arr[]) 
    {  int n=arr.length;
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 
  
        int sum = 0;
        int max_len = 0;
        int ending_index = -1; 
        int start_index = 0; 
  
        for (int i = 0; i < n; i++) { 
            arr[i] = (arr[i] == 0) ? -1 : 1; 
        } 
  
        for (int i = 0; i < n; i++) { 
            sum += arr[i]; 
            if (sum == 0) { 
                max_len = i + 1; 
                ending_index = i; 
            } 
            if (hM.containsKey(sum + n)) { 
                if (max_len < i - hM.get(sum + n)) { 
                    max_len = i - hM.get(sum + n); 
                    ending_index = i; 
                } 
            } 
            else 
                hM.put(sum + n, i); 
        } 
  
        for (int i = 0; i < n; i++) { 
            arr[i] = (arr[i] == -1) ? 0 : 1; 
        } 
  
        int end = ending_index - max_len + 1; 
        //System.out.println(end + " to " + ending_index); 
  
        return max_len; 
    } 
}
