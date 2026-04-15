public class DisjSet {
    int[] parent;

    public DisjSet(int n) {
        parent=new int[n];
        for (int i = 0; i < n; i++) {
            parent[i]=i;
        }
    }

    int find(int k){
        if(parent[k]==k) return k;
        return parent[k]=find(parent[k]);
    }

    void union(int a,int b){
        int pa=find(a);
        int pb=find(b);
        if(pa!=pb)parent[pb]=pa;
    }

    public static void main(String[] args) {
        DisjSet d=new DisjSet(5);
        d.union(0, 1);  //maps 1 to 0
        d.union(1, 2);  //maps 2 to parent of 1 ie. 0. Both 2 and 1 are mapped to 0, the leader of the new group now
        
    }
}
