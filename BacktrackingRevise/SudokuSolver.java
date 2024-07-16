package BacktrackingRevise;

public class SudokuSolver {
    static int check=0;
    public static boolean isValid(char [][] board,int row,int col,char num)
    {
        for(int j=0;j<9;j++)
        {
            if(board[row][j]==num)
            {
                return false;
            }
        }
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==num)
            {
                return false;
            }
        }
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
    static void helper(char [][]board,int row,int col)
    {
        int n=board.length;
        if(row==n)
        {
            check=1;
            return;
        }
        else if(board[row][col]!='.')
        {
            if(col!=n-1)
            {
                helper(board,row,col+1);
            }
            else helper(board,row+1,0);
        }
        else
        {
            for(char ch='0';ch<='9';ch++)
            {
                if(isValid(board,row,col,ch))
                {
                    board[row][col]=ch;
                    if(col!=n-1)
                    {
                        helper(board,row,col+1);
                    }
                    else helper(board,row+1,0);
                    if(check==1) return;
                    board[row][col]='.';
                }
            }
        }
    }
    public static void main(String[] args) {
        char [][]board={{'5','3','.','.','7','.','.','.','.'}
                       ,{'6','.','.','1','9','5','.','.','.'}
                       ,{'.','9','8','.','.','.','.','6','.'}
                       ,{'8','.','.','.','6','.','.','.','3'}
                       ,{'4','.','.','8','.','3','.','.','1'}
                       ,{'7','.','.','.','2','.','.','.','6'}
                       ,{'.','6','.','.','.','.','2','8','.'}
                       ,{'.','.','.','4','1','9','.','.','5'}
                       ,{'.','.','.','.','8','.','.','7','9'}};

        helper(board,0,0);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
