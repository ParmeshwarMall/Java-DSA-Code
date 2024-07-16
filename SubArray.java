import java.util.*;
public class SubArray {
    static void helper(int a[],List<List<Integer>>ll)
    {
        for(int i=0;i<a.length;i++)
        {
            List<Integer>l=new ArrayList<>();
            for(int j=i;j<a.length;j++)
            {
                l.add(a[j]);
                ll.add(new ArrayList<>(l));
            }
        }
    }

    public static int minim(List<Integer>l)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l.size();i++)
        {
            min=Math.min(min,l.get(i));
        }
        return min;
    }
    public static void main(String[] args) {
        int a[]={3,1,2,4};
        List<List<Integer>>ll=new ArrayList<>();
        helper(a,ll);

        int ans=0;
        for(int i=0;i<ll.size();i++)
        {
            ans+=minim(ll.get(i));
        }
        System.out.println(ans);
    }
}
