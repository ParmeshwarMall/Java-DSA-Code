package Hashmap;
import java.util.*;
public class MaximumLengthSumZero {
    static int mxLength(int a[])
    {
        int n=a.length;
        int mxLen=0;
        int prefSum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            prefSum+=a[i];
            if(mp.containsKey(prefSum))
            {
                mxLen=Math.max(i,i-mp.get(prefSum));
            }
            else mp.put(prefSum,i);
        }
        return mxLen;
    }

    public static void main(String[] args) {
        int []a={-776,794,387,-648,363,691,764,-539,-171,-210,-566,783,-861,68 ,930 ,-21 ,-68 ,394 ,-10 ,-228, 422 ,785 ,199 ,-314 ,-412 ,-90 ,-955 ,863 ,-995 ,306 ,85 ,337 ,847 ,314 ,125 ,583, 815 ,435 ,-42, -86, -275, -787, -402, 755, 933 ,-675 ,-738 ,-225, -93 ,796 ,-433 ,-466 ,98 ,-316 ,-651 ,-300 ,-285 ,866, 445 ,441 ,32 ,98, 482, 710, 568 ,-496, 587 ,307 ,220, -527, 733 ,504, 271, -707 ,341 ,797, 619, 847 ,922 ,380 ,-763 ,-840 ,-192 ,-33};
        System.out.println(mxLength(a));
    }
}
