package BacktrackingRevise;
import java.util.*;

public class queenSolve {
    static boolean isSafe(char arr[][],int row,int col)
    {
        int n=arr.length;
        for(int j=0;j<n;j++)
        {
            if(arr[row][j]=='Q')
            {
                return false;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i][col]=='Q')
            {
                return false;
            }
        }
        int r=row;
        int c=col;
        while(r>=0 && c>=0)
        {
            if(arr[r][c]=='Q') return false;
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<n)
        {
            if(arr[r][c]=='Q') return false;
            r--;
            c++;
        }
        r=row;
        c=col;
        while(r<n && c>=0)
        {
            if(arr[r][c]=='Q') return false;
            r++;
            c--;
        }
        r=row;
        c=col;
        while(r<n && c<n)
        {
            if(arr[r][c]=='Q') return false;
            r++;
            c++;
        }
        return true;
    }

    static void queen(char [][]arr,int row,ArrayList<ArrayList<Integer>> ans)
    {
        int n=arr.length;
        if(row==n)
        {
            ans.add(helper(arr));
            print(arr);
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(arr,row,j))
            {
                arr[row][j]='Q';
                queen(arr,row+1,ans);
                arr[row][j]='X';
            }
        }
    }

    static ArrayList<Integer> helper(char [][]arr)
    {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]=='Q')
                {
                    l.add(j+1);
                }
            }
        }
        return l;
    }

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        char [][]arr=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]='X';
            }
        }
        queen(arr,0,ans);
        return ans;
    }

    static void print(char [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println(nQueen((4)));
    }
}
