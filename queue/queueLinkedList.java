package Queue;

public class queueLinkedList {
    static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }   

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        public static void add(int value) {
            Node node = new Node(value);
            if(tail == null) {
                head = tail = node;
                return;
            } 
            tail.next = node;
            tail = node;
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.value;
            if(head == tail) { // SINGLE ELEMENT CONDITION
                tail = null;
            }
            head = head.next;
            return front;
        }
        public static int peak() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.value;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(120);
        q.add(10);
        q.add(7);
        q.add(3);
        q.add(1);
        while(!q.isEmpty()) {
            System.out.print(q.peak() + " ");
            q.remove();
        }
    }
}
