import java.util.ArrayList;
import java.util.List;

public class Graph {
    public static void main(String[] args) {
        // Adjacency List
        int v=3;
        List<List<Integer>> gList=new ArrayList<>();
        for(int i=0;i<v;i++){
            gList.add(new ArrayList<>());
        }
        gList.get(0).add(1);
        gList.get(1).add(0);
        gList.get(0).add(2);
        gList.get(2).add(0);
        System.out.println(gList);

        // Adjacency Matrix

    }    
}