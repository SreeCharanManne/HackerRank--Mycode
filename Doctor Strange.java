import java.util.*;

class Graph {
    
    private int V;
    static int NIL = -1;
    int time = 0;
    static ArrayList<Integer> adj[];
    static boolean ap[];
    
    
    public Graph(int v) {
        V = v;
        adj = new ArrayList[v];
        for(int i=0;i<v;i++) {
            adj[i] = new ArrayList();
        }
    }
    
    void addEdge(int s, int d) {
        adj[s].add(d);
        adj[d].add(s);
    }
    
    void AP() {
        boolean vis[] = new boolean[V];
        int parent[] = new int[V];
        int low[] = new int[V];
        int disc[] = new int[V];
        ap = new boolean[V];
        
        
        for(int i=0;i<V;i++) {
            parent[i] = NIL;
        }
        
        for(int i=0;i<V;i++) {
        	if(!vis[i])
        		APUtil(i, parent, vis, low, disc, ap);
        }
    }
    
    void APUtil(int u, int parent[], boolean vis[], int low[], int disc[], boolean ap[]) {
        int children = 0;
        vis[u] = true;
        low[u] = disc[u] = ++time;
        Iterator<Integer> it = adj[u].iterator();
        while(it.hasNext()) {
            int v = it.next();
            
            if(!vis[v]) {
                children++;
                parent[v] = u;
                APUtil(v, parent, vis, low, disc, ap);
                
                low[u] = Math.min(low[u], low[v]);
                
                if(parent[u]==NIL && children>1) {
                    ap[u] = true;
                }
                if(parent[u]!=NIL && low[v]>=disc[u]) {
                    ap[u] = true;
                }
                
            } else if(v!=parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            Graph g = new Graph(v);
            for(int i=0;i<e;i++) {
            	int s = sc.nextInt()-1;
            	int d = sc.nextInt()-1;
                g.addEdge(s, d);
            }
            g.AP();
            int count = 0;
            for(int i=0;i<v;i++) {
                if(ap[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
        
    }
}










