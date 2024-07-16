public class StringDiv {
    public static void main(String[] args) {
        String s="dog cat cat dog";
        int i=0;
        while(i<s.length())
        {
            String ans="";
            while(s.charAt(i)!=' ' && i<s.length()-1)
            {
                ans+=s.charAt(i);
                i++;
            }
            if(i==s.length()-1)
            {
                ans+=s.charAt(s.length()-1);
            }
            System.out.println(ans);
            i++;
        }
    }
}
