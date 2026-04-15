//Graph w adj list
import java.util.*;
public class AdjList {
    static int v;
    List<List<Integer>> adj;

    @SuppressWarnings("static-access")
    public AdjList(int v) {
        this.v=v;
        adj=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());    
        }
    }
    void adde(int u,int v){
        //undirected
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
    void disp(){
        for (int i = 0; i < v; i++) {
            System.out.println(i+" -> "+adj.get(i));
        }
    }

    void bfs(int st){
        System.out.println("BFS from "+st+":");
        boolean[] vis=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(st);
        vis[st]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int nei:adj.get(node)){
                if(!vis[nei]){            //nei > neighbour
                    vis[nei]=true;
                    q.add(nei);
                }
            }
        }
    }

    void dfs(int node,boolean[] vis){
        vis[node]=true;
        System.out.print(node+" ");
        for(int nei:adj.get(node)){
            if(!vis[nei]) dfs(nei,vis);
        }
    }

    public static void main(String[] args) {
        AdjList a=new AdjList(4);
        a.adde(0, 1);
        a.adde(0, 2);
        a.adde(1, 3);
        a.disp();
        a.bfs(2);
        System.out.println("DFS from 3:");
        boolean[] vis=new boolean[v];
        a.dfs(3, vis);
    }
}
