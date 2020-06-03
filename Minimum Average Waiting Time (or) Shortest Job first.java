import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class Pizza{
        public long entry; public long timeCost;
        public Pizza(long e, long c){this.entry=e; this.timeCost=c;}
        public String toString(){return "Pizza (" + entry + ", " + timeCost+")";}
    }
    public static void main(String[] args) {
        List<Pizza> list = new ArrayList<Pizza>(); //The list to hold the sorted orders
        //The min-heap
        PriorityQueue<Pizza> q = new PriorityQueue<Pizza>((Pizza p1, Pizza p2)-> (int)(p1.timeCost - p2.timeCost));
        
        //Read the values from Standard Input
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        for (int i=0; i < numRows; i++){
            int entry = sc.nextInt();
            Pizza p = new Pizza(entry, sc.nextInt());
            list.add(p);
        }//Sort the list
        Collections.sort(list, (Pizza p1, Pizza p2)-> (int)(p1.entry - p2.entry));
        
        //-------MAIN CODE-----------------
        Pizza first = list.get(0);
        long endTime = first.entry;  // make sure your endTime starts with the first Pizza entry
        long waitingTime = 0L;
        
        while (! (list.isEmpty() && q.isEmpty())){
            Pizza p;  // remove a pizza from the queue first. If it's empty, then the list
            if (! q.isEmpty())  p = q.poll();
            else p = list.remove(0);
            
            //Compute endTime and waitingTime
            endTime += p.timeCost;
            waitingTime += endTime - p.entry;
            
            //Remove from the list and add to the queue all pizza orders that were entered before endTime.
            addToQueue(list, q, endTime );
        }
        // Print the Average waiting time
        System.out.println(waitingTime / numRows);
    }
    
    public static void addToQueue(List<Pizza> list, PriorityQueue<Pizza> q, long timeLimit){
            while (! list.isEmpty() && list.get(0).entry < timeLimit){
                q.add(list.remove(0));
            }
    }
}
