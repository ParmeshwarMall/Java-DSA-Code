package Backtracking;

public class ValidSudoku {
    static boolean isValid(char[][] board,int row,int col,char num)
    {
        int n=board.length;
        // Check columns
        for(int j=0;j<n;j++)
        {
            if(board[row][j]==num)
                return false;
        }

        // Check row
        for(int i=0;i<n;i++)
        {
            if(board[i][col]==num)
                return false;
        }

        // Check 3x3 matrix
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if(board[i][j]==num)
                    return false;
            }
        }
        return true;
    }
    static boolean isValidSudoku(char[][] board)
    {
        int n=board.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='.')
                    continue;
                char num=board[i][j];
                board[i][j]='.';
                if(isValid(board,i,j,num)==false)
                {
                    return false;
                }
                board[i][j]=num;
            }
        }
        return true;
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

        System.out.println(isValidSudoku(board));
    }
}
