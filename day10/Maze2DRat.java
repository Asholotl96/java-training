import java.util.Arrays;

public class Maze2DRat {
    static int N=5;
    static boolean Safe(int[][]maze,int x,int y){
        return(x<N && y<N && maze[x][y]==1);
    }
    static boolean mazes(int[][]maze, int x,int y,int[][] res){
        if(x==N-1 && y==N-1 && maze[x][y]==1){
            res[x][y]=1;
            return true;
        }
        if(Safe(maze,x,y)){ 
            res[x][y]=1;
            if(mazes(maze,x,y+1,res)) return true;
            if(mazes(maze,x+1,y,res)) return true;
            res[x][y]=0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][]={{1,1,0,1,0},
                      {0,1,1,1,0},
                      {0,1,0,1,0},
                      {0,1,1,1,1},
                      {0,0,0,0,1}};
        int res[][]=new int[N][N];
        if(mazes(maze,0,0,res)){
            for(int i=0;i<N;i++) System.out.println(Arrays.toString(res[i]));
        }
        else System.out.println("No safe path");
    }
}
