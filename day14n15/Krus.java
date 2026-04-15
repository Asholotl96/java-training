import java.util.*;

class Edge{
    int u,v,wt;
    Edge(int a,int b,int d){
        u=a;
        v=b;
        wt=d;
    }
}
class DisjS {
    int[] parent;
    DisjS(int n) {
        parent=new int[n];
        for (int i = 0; i < n; i++) {
            parent[i]=i;
        }
    }

    int find(int k){
        if(parent[k]==k) return k;
        return parent[k]=find(parent[k]);
    }

    void union(int u,int v){
        int pu=find(u);
        int pv=find(v);
        if(pu!=pv)parent[pv]=pu;
    }
}

public class Krus{
    public static void main(String[] args) {
        int n=5;
        char[] name={'A','B','C','D','E'};
        List<Edge> es=new ArrayList<>();
        es.add(new Edge(0, 1, 1)); //AB
        es.add(new Edge(3, 4, 2)); //DE
        es.add(new Edge(1, 2, 3)); //BC
        es.add(new Edge(2, 3, 4)); //CD
        es.add(new Edge(0, 4, 5)); //AE
        es.add(new Edge(0, 2, 7)); //AC
        es.add(new Edge(0, 3, 10)); //AD

        //sort
        Collections.sort(es,(a,b)->a.wt-b.wt);

        //kruskal
        DisjS d=new DisjS(n);
        int mstwt=0;
        System.out.println("MST edges: ");
        for(Edge e:es){
            int u=e.u;
            int v=e.v;
            if(d.find(u)!=d.find(v)){
                d.union(u, v);
                mstwt+=e.wt;
                System.out.println(name[u]+"-"+name[v]+": "+e.wt);
            }
        }
        System.out.println("Total MST weight: "+mstwt);
    }
}