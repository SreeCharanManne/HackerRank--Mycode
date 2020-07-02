import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    while (t-- > 0) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken());
	        int m = Integer.parseInt(st.nextToken());
	        
	        st = new StringTokenizer(br.readLine());
	        int[][] num = new int[n][m];
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < m; j++)
	                num[i][j] = Integer.parseInt(st.nextToken());
	                
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
                k = Integer.parseInt(st.nextToken());
            floodFillQue(num, x, y, k);
            printMat(num);
	    }
	}
	
	// recursive
	public static void floodFill(int[][] a, int x, int y, int k) {
	    floodFill(a, x, y, k, a[x][y]);
	}
	private static void floodFill(int[][] a, int x, int y, int k, int d) {
	    if (a[x][y] != d)   return;
	    a[x][y] = k;
	    
	    if (x != 0)                 floodFill(a, x-1, y, k, d);
	    if (y != 0)                 floodFill(a, x, y-1, k, d);
	    if (x != a.length-1)        floodFill(a, x+1, y, k, d);
	    if (y != a[x].length-1)     floodFill(a, x, y+1, k, d);
	}

    // iterative with queue	
	public static void floodFillQue(int[][] a, int x, int y, int k) {
	    if (a[x][y] == k)   return;
	    int pre = a[x][y];
	    Queue<Pixel> q = new ArrayDeque<>(a[0].length*2);
	    q.add(new Pixel(x, y));
	    while (!q.isEmpty()) {
	        Pixel curr = q.poll();
	        int i = curr.getX(), j = curr.getY();
	        if (a[i][j] != pre)     continue;
	        
	        int jMin = j, jMax = j;
            while (a[i][jMin] == pre)
                if(jMin-- == 0)               break;
            while (a[i][jMax] == pre)
                if(jMax++ == a[i].length-1)   break;
	            
            while (++jMin < jMax) {
                a[i][jMin] = k;
                if (i != 0          && a[i-1][jMin] == pre)     q.offer(new Pixel(i-1, jMin));
                if (i != a.length-1 && a[i+1][jMin] == pre)     q.offer(new Pixel(i+1, jMin));
                //  if (i != 0 && a[i-1][jMin] == pre &&
                //      (jMin == 0 || a[i-1][jMin-1] != pre) )          q.offer(new Pixel(i-1, jMin));
                //  if (i != a.length-1 && a[i+1][jMin] == pre &&
                //      (jMin == 0 || a[i+1][jMin-1] != pre) )          q.offer(new Pixel(i+1, jMin));
            }
	    }
	}
	
	public static void printMat(int[][] a) {
	    StringBuilder sb = new StringBuilder();
	    for (int[] row : a)
	        for (int i : row)
	            sb.append(i + " ");
	    System.out.println(sb.toString());         
	}
}

class Pixel {
    private int x;
    private int y;
    
    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX()   { return x; }
    public int getY()   { return y; }
}
