import java.util.*;
class Pairr{
    int node,wt;

    public Pairr(int n,int w) {
        node=n;
        wt=w;
    }
}
public class Prim {
    public static void main(String[] args) {
        int v=4;
        List<List<Pairr>> adj=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pairr(1, 1));
        adj.get(1).add(new Pairr(0, 1));
        adj.get(0).add(new Pairr(2, 4));
        adj.get(2).add(new Pairr(0, 4));
        adj.get(1).add(new Pairr(3, 2));
        adj.get(3).add(new Pairr(1, 2));
        adj.get(2).add(new Pairr(3, 3));
        adj.get(3).add(new Pairr(2, 3));

        boolean[] vis=new boolean[v];
        PriorityQueue<Pairr> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
        pq.add(new Pairr(0, 0));
        int sum=0;
        while(!pq.isEmpty()){
            Pairr cur=pq.poll();
            if(vis[cur.node]) continue;
            vis[cur.node]=true;
            sum+=cur.wt;
            for(Pairr nei:adj.get(cur.node)){
                if(!vis[nei.node]) pq.add(nei);
            }
        }
        System.out.println("MST wt: "+sum);
    }
}
