import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> openingBrackets = Arrays.asList('{','[','(');
        List<Character> closingBrackets = Arrays.asList('}',']',')');
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if(openingBrackets.contains(bracket)){
                stack.push(bracket);
            }
            else {
                if (stack.isEmpty())
                    return false;
                if (openingBrackets.indexOf(stack.peek())==closingBrackets.indexOf(bracket))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        new ValidParanthesis().isValid("(])");
    }
}
