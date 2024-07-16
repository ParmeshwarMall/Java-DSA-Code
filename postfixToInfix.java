 import java.util.Stack;

public class postfixToInfix {

    public String convert(String expression){

        Stack<String> stack = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            if(c=='*'||c=='/'||c=='^'||c=='+'||c=='-' ){
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = "("+s2+c+s1+")";
                stack.push(temp);
            }else{
                stack.push(c+"");
            }
        }

        String result=stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String exp = "ABC/-AK/L-*";
        System.out.println("Postfix Expression: " + exp);
        System.out.println("Infix Expression: " + new postfixToInfix().convert(exp));
    }
}

