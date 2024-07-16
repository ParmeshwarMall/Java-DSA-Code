package BacktrackingRevise;

public class RatInaMaze4dirn {
    static void path(int sr,int sc,int er,int ec,String s,boolean[][] isVis)
    {
        if(sr<0 || sc<0)
            return;
        if(sr>er || sc>ec)
            return;
        if(isVis[sr][sc]==true)
            return;
        if(sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        isVis[sr][sc]=true;
        path(sr,sc+1,er,ec,s+"R",isVis);
        path(sr+1,sc,er,ec,s+"D",isVis);
        path(sr,sc-1,er,ec,s+"L",isVis);
        path(sr-1,sc,er,ec,s+"U",isVis);

        isVis[sr][sc]=false;

    }

    public static void main(String[] args) {
        int row=3;
        int col=3;
        boolean isVis[][]=new boolean[row][col];
        path(0,0,row-1,col-1,"",isVis);

    }
}
