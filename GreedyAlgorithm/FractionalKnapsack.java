package GreedyAlgorithm;

import java.util.*;
//import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]={30,40,45,77,90};
        int weight[]={5,10,15,22,25};
        int w=60;

        double ratio[][]=new double[val.length][2];
        // 1st column contain index and 2nd column contain ratio

        for(int i=0;i< val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        int ans=0;

        for(int i=ratio.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])
            {
                ans+=val[idx];
                capacity-=weight[idx];
            }
            else
            {
                ans+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }

        System.out.println(ans);
    }
}
