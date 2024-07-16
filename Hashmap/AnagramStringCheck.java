package Hashmap;
import java.util.*;
public class AnagramStringCheck {

    static HashMap<Character,Integer> freq(String str)
    {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,1);
            }
            else
            {
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
    static boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> mp1=freq(s);
        HashMap<Character,Integer> mp2=freq(t);
        return mp1.equals(mp2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listep","netsil"));
    }
}
