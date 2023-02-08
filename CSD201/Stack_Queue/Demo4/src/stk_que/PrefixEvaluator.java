package stk_que;

import java.util.Stack;
import java.util.StringTokenizer;

public class PrefixEvaluator {
    
    public static boolean isOperator(String S) {
        return (S.equals("+") || S.equals("-")
                || S.equals("*") || S.equals("/"));
    }
    
    public static double evaluate(String op, double n1, double n2) {
        if (op.equals("+")) {
            return n2+n1;
        }
        if (op.equals("-")) {
            return n2-n1;
        }
        if (op.equals("*")) {
            return n2*n1;
        }
        if (op.equals("/")) {
            if (n1 == 0) {
                throw new RuntimeException("Divide by 0!");
            }
            return n2 / n1;
        }
        throw new RuntimeException("Operator is not supported!");
    }
    
    public static double evaluate(String exp) {
        double result = 0;
        StringTokenizer stk = new StringTokenizer(exp, "() ");
        Stack<Double> stack = new Stack();
        double n1, n2;
        while (stk.hasMoreElements()) {
            String part = stk.nextToken();
            if (!isOperator(part)) {
                stack.push(Double.parseDouble(part));
            } else {
                n1 = stack.pop();
                n2 = stack.pop();
                result = evaluate(part, n1, n2);
                stack.push(result);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String exp = "((2)(3)(1)* +(9)-";
        System.out.println(evaluate(exp));
    }
}
