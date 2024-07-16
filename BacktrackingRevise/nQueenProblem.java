package BacktrackingRevise;

public class nQueenProblem {
    public static void print(char[][]b)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char [][]board,int row,int col)
    {
        int n=board.length;
        for(int j=0;j<n;j++)
        {
            if(board[row][j]=='Q')
                return false;
        }
        for(int i=0;i<n;i++)
        {
            if(board[i][col]=='Q')
                return false;
        }
        int i=row;
        int j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
                return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
                return false;
            i--;
            j++;
        }
        i=row;
        j=col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')
                return false;
            i++;
            j--;
        }
        i=row;
        j=col;
        while(i<n && j<n)
        {
            if(board[i][j]=='Q')
                return false;
            i++;
            j++;
        }
        return true;
    }
    public static void nQueen(char[][] board,int row)
    {
        int n=board.length;
        if(row==n)
        {
            print(board);
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nQueen(board,row+1);
                board[row][j]='X';
            }
        }
    }

    public static void main(String[] args) {
        int n=4;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='X';
            }
        }
        nQueen(board,0);
        //print(board);
    }
}
