package BacktrackingRevise;


public class RatInaMaze2dir {
    static int ways(int sr,int sc,int er,int ec)
    {
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;

        return ways(sr,sc+1,er,ec)+ways(sr+1,sc,er,ec);
    }
    public static void main(String[] args) {
        int row=3;
        int col=3;
        System.out.println(ways(1,1,row,col));
    }
}
