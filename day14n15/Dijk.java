import java.util.*;

class Pair{
    int node, dist;

    public Pair(int n, int d) {
        node=n;
        dist=d;
    }
}
public class Dijk {
    public static void main(String[] args) {
        int v=4;
        List<List<Pair>> g=new ArrayList<>();
        for(int i=0;i<v;i++){
            g.add(new ArrayList<>());
        }
        g.get(0).add(new Pair(1, 4));
        g.get(0).add(new Pair(2, 1));
        g.get(1).add(new Pair(3, 2));
        g.get(2).add(new Pair(3, 3));
        int[] dist=new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        dist[0]=0;
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            for(Pair n:g.get(curr.node)){
                if(curr.dist+n.dist < dist[n.node]){
                    dist[n.node]=curr.dist+n.dist;
                    pq.add(new Pair(n.node, dist[n.node]));
                }
            }
        }
        System.out.println(""+Arrays.toString(dist));
    }
}
