package DataStructure;

public class LinkedList_Impl {
    static class LinkedList<V> {
        private class Node {
            V value;
            Node next;
            public Node(V value) {
                this.value = value;
                next = null;
            }
        }
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(V value) {
            Node node = new Node(value);
            if(head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }
        void insertAtHead(V value) {
            Node node = new Node(value);
            if(head == null) {
                insertAtEnd(value);
            } else {
                node.next = head;
                head = node;
                size++;
            }
        }
        void insertAt(int index, V value) {
            Node temp = head;
            Node node = new Node(value);
            if(head == null) {
                insertAtEnd(value);
            } else {
                for(int i = 0; i < index-1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
        V getElement(int index) {
            Node temp = head;
            if(head == null) {
                return null;
            }
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.value;
        }
        void deleteAt(int index) {
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.insertAtEnd("India");
        ll.insertAtEnd("China");
        ll.insertAtEnd("Russia");
        ll.insertAtHead("America");
        ll.insertAt(2, "Canada");

        ll.display();

        ll.deleteAt(2);
        ll.display();

        System.out.println("At index 2: " + ll.getElement(2));

        System.out.println("Head: " + ll.head.value);
        System.out.println("Tail: " + ll.tail.value);
        System.out.println("Size: " + ll.size);
    }
}
