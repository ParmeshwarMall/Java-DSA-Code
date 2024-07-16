package Tries;

public class WordBreakProblem {
    static class Node {
        Node []children=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
        }
    }
    static Node root=new Node();

    static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++)
        {
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }

    static boolean wordBreak(String key) {
        if (key.length() == 0)
        {
            return true;
        }
        for(int i=1;i<=key.length();i++)
        {
            if(search(key.substring(0,i)) && wordBreak(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String []words={"i","like","sam","samsung","mobile"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        String key="iliksamsung";
        System.out.println(wordBreak(key));
    }
}
