package Queue;

import java.util.*;

public class ImplementStackUsingQueue2 {
    static class StackQ
    {
        Queue<Integer> q=new LinkedList<>();

        void push(int val)                 //Time complexity
        {                                  //push O(n)
            if(q.size()==0)                //pop O(1)
                q.add(val);                //peek O(1)
            else
            {
                q.add(val);
                for(int i=1;i<=q.size()-1;i++)
                {
                    q.add(q.remove());
                }
            }
        }
        int pop()
        {
            return q.remove();
        }
        int peek()
        {
            return q.peek();
        }
        void display()
        {
            while(q.size()!=0)
            {
                System.out.print(q.remove()+" ");
            }
        }
    }

    public static void main(String[] args) {
        StackQ st=new StackQ();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        st.display();
    }
}
