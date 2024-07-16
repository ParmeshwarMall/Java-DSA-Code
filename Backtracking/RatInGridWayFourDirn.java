package Backtracking;

public class RatInGridWayFourDirn {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean [][] isVisited=new boolean[rows][cols];
        RatGrid(0,0,rows-1,cols-1,"",isVisited);
    }

    static void RatGrid(int sr,int sc,int er,int ec,String s,boolean [][]isVisited)
    {
        if(sr<0 || sc<0)
            return;
        if(sr>er || sc>ec)
            return;
        if(isVisited[sr][sc]==true)
            return;
        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        // go right
        RatGrid(sr,sc+1,er,ec,s+"R",isVisited);
        // go down
        RatGrid(sr+1,sc,er,ec,s+"D",isVisited);
        // go left
        RatGrid(sr,sc-1,er,ec,s+"L",isVisited);
        // go up
        RatGrid(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc]=false;
    }
}
