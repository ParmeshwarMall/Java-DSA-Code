package Queue;

import java.util.*;

public class PrintElementOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(q.size()!=0)
        {
            int a=q.remove();;
            System.out.print(a+" ");
        }
    }
}
