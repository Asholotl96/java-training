import java.util.*;
public class CycleDet {
    int v;
    List<List<Integer>> adj;
    public CycleDet(int v) {
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
    boolean dfs(int node,int parent,boolean[] vis){
        vis[node]=true;
        for(int nei:adj.get(node)){
            if(!vis[nei]) {
                if(dfs(nei,node,vis)) return true;
            }
            else if(nei!=parent) return true;
        }
        return false;
    }
    boolean isCyclic(){
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(i,-1,vis))return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDet a=new CycleDet(4);
        a.adde(0, 1);
        a.adde(0, 2);
        a.adde(1, 3);
        a.adde(2, 1);
        System.out.println(a.isCyclic());
        a.disp();
    }
}