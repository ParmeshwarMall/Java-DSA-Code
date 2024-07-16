package Queue;
import java.util.*;
public class ImplementStackUsingQueue1 {
    public static class StackQ
    {
        Queue<Integer> q1=new LinkedList<>();

        public void push(int val)             //Time complexity--
        {                                     //push O(1)
            q1.add(val);                       //pop O(n)
        }                                     //peek O(n)
         public int peek()
        {
            for(int i=1;i<=q1.size()-1;i++)
            {
                q1.add(q1.remove());
            }
            int x=q1.peek();
            q1.add(q1.remove());
            return x;
        }

        public int pop()
        {
            for(int i=1;i<=q1.size()-1;i++)
            {
                q1.add(q1.remove());
            }
            return q1.remove();
        }
        public void display()
        {
            while(q1.size()!=0) {
                for (int i = 0; i < q1.size() - 1; i++) {
                    q1.add(q1.remove());
                }
                System.out.print(q1.remove()+" ");
            }
        }
    }

    public static void main(String[] args) {
        StackQ st=new StackQ();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.pop();
        st.display();


    }
}
