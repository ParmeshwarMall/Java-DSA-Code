package GFG;

import java.util.HashMap;

public class SingleElement {
    static int singleElement(int[] arr , int N) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(var i:map.entrySet())
        {
            if(i.getKey()==1)
            {
                return i.getValue();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[]={1,3,1,1};
        System.out.println(singleElement(a,4));
    }
}
