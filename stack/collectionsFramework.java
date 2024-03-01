package Stack;

import java.util.*;

public class collectionsFramework {
    public static void pushAtBottom(int value, Stack<Integer> stack) {
        if(stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        pushAtBottom(value, stack);
        stack.push(top);
    }
    // TRYING
    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        while(!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        return newStack;
    }
    public static void revStack(Stack<Integer> stack) {
        int top = stack.pop();
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(4, stack);

        while(!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

        Stack reversedStack = reverseStack(stack);
        while(!reversedStack.isEmpty()) {
            System.out.print(reversedStack.peek() + " ");
            reversedStack.pop();
        }
    }

}
