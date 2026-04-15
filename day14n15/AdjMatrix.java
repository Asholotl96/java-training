//Graph adjacency matrix
public class AdjMatrix {
    public static void main(String[] args) {
        int v=3;
        int[][] adj=new int[v][v];
        adj[0][1]=1;
        adj[1][0]=1;
        adj[1][2]=1;
        adj[2][1]=1;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}
