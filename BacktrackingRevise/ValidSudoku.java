package BacktrackingRevise;

public class ValidSudoku {

    public static boolean helper(char [][] board,int row,int col,char num)
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

    public static void main(String[] args) {
        char [][] board={{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {

                if(board[i][j]!='.')
                {
                    char curr=board[i][j];
                    board[i][j]='X';
                    if(helper(board,i,j,curr)==false)
                    {
                        System.out.println(false);
                        return;
                    }
                    board[i][j]=curr;
                }
            }
        }
        System.out.println(true);
    }
}
