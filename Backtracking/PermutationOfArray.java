package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void helper1(int a[],List<Integer>l,List<List<Integer>>ans,boolean []isVis)
    {
        if(a.length==l.size())
        {
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(isVis[i]==false)
            {
                l.add(a[i]);
                isVis[i]=true;
                helper1(a,l,ans,isVis);
                isVis[i]=false;
                l.remove(l.size()-1);
            }
        }
    }

    static void helper2(int a[],int idx,List<List<Integer>>ans)
    {
        if(idx==a.length)
        {
            List<Integer>l=new ArrayList<>();
            for(int j=0;j<a.length;j++)
            {
                l.add(a[j]);
            }
            ans.add(l);
        }

        for(int i=idx;i<a.length;i++)
        {
            swap(i,idx,a);
            helper2(a,idx+1,ans);
            swap(i,idx,a);
        }
    }

    public static void swap(int i,int j,int a[])
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int n=a.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        boolean []isVis=new boolean[n];
//        helper1(a,l,ans,isVis);
//        System.out.println(ans);

        helper2(a,0,ans);
        System.out.println(ans);
    }
}
