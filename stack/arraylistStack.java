package Stack;
import java.util.ArrayList;

public class arraylistStack {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int value) {
            list.add(value);
        }
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1;
            } 
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(120);
        stack.push(17);
        stack.push(56);

        while(!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
