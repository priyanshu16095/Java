package DataStructure;
public class Perfecrt_LL {
    static class LinkedList<V> {
        private class Node {
            V value;
            Node next;
            public Node(V value) {
                this.value = value;
                next = null;
            }
        }
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public void insertAtEnd(V value) {
            Node node = new Node(value);
            if(head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }
        public void insertAtHead(V value) {
            Node node = new Node(value);
            if(head == null) {
                insertAtEnd(value);
                return;
            } else {
                node.next = head;
                head = node;
                size++;
            }
        }
        public void insertAt(int index, V value) {
            Node temp = head;
            Node node = new Node(value);
            if(index < 0 || index > size) {
                System.out.println("Wrong Index!");
                return;
            } else if(head == null) {
                insertAtEnd(value);
                return;
            }
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
        public void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        public V getElementAt(int index) {
            Node temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.value;
        }
        public V deleteElementAt(int index) {
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return temp.next.value;
        }
        // SPACE-COMPLEXITY: O(1) | TIME-COMPLEXITY: O(N)
        public void reverseList() {
            if(head == null || head.next == null) {
                return;
            }
            Node prevNode = head;
            Node currNode = head.next;
            while(currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }
    }
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.insertAtEnd("India");
        ll.insertAtEnd("Russia");
        ll.insertAtEnd("China");
        ll.insertAtEnd("US");

        ll.insertAtHead("Canada");
        ll.insertAt(2, "Australia");

        ll.display();

        System.out.println("At index 2: " + ll.getElementAt(2));
        
        System.out.println("Size: " + ll.size);
        System.out.println("Head: " + ll.head.value);
        System.out.println("Tail: " + ll.tail.value);

        System.out.println("Deleted element: " + ll.deleteElementAt(3));
        ll.display();

        ll.reverseList();
        ll.display();
    }
}