package SolveProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        int n=q.size();
        Queue<Integer>temp=new LinkedList<>();
        for(int i=0;i<(n/2);i++)
        {
            temp.add(q.remove());
        }

        System.out.println(temp);
        System.out.println(q);

        while(q.size()>0 && temp.size()>0)
        {
            System.out.print(temp.remove()+" ");
            System.out.print(q.remove()+" ");
        }
        if(temp.size()!=0)
        {
            System.out.println(temp.remove());
        }
        if(q.size()!=0)
        {
            System.out.println(q.remove());
        }

    }
}
