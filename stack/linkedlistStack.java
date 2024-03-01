package Stack;
public class linkedlistStack {
    // CAN BE IMPLEMENTED IN THREE WAYS
    // ARRAY | ARRAYLIST | LINKED LIST
    static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            next = null;
        }
    }
    
    static class Stack {
        static Node head; // LAST INSERTED ELEMENT IS HEAD

        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int value) {
            Node node = new Node(value);
            if(isEmpty()) {
                head = node;
                return;
            } else {
                node.next = head;
                head = node;
            }
        }
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.value;
            head = head.next;
            return top;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.value;
        }
        public static void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(120);
        stack.push(17);
        stack.push(56);
        stack.display();

        stack.pop();
        stack.display();

        System.out.println(stack.peek());
    }
}