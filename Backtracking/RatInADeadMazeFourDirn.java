package Backtracking;

public class RatInADeadMazeFourDirn {
    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        boolean [][] isVisited=new boolean[rows][cols];
        int [][] maze={{1,0,1,1},
                       {1,1,1,1},
                       {1,1,0,1}};
        RatGrid(0,0,rows-1,cols-1,"",maze,isVisited);
    }

    static void RatGrid(int sr,int sc,int er,int ec,String s,int [][]maze,boolean [][]isVisited)
    {
        if(sr<0 || sc<0)
            return;
        if(sr>er || sc>ec)
            return;
        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(isVisited[sr][sc]==true)
            return;
        isVisited[sr][sc]=true;
        // go right
        RatGrid(sr,sc+1,er,ec,s+"R",maze,isVisited);
        // go down
        RatGrid(sr+1,sc,er,ec,s+"D",maze,isVisited);
        // go left
        RatGrid(sr,sc-1,er,ec,s+"L",maze,isVisited);
        // go up
        RatGrid(sr-1,sc,er,ec,s+"U",maze,isVisited);
        isVisited[sr][sc]=false;
    }
}
