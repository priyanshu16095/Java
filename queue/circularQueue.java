package Queue;
public class circularQueue {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        public CircularQueue(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        public static boolean isEmpty() {
            return (rear == -1 && front == -1);
        }
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }
        public static void add(int value) {
            if(isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = value;
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            // SINGLE ELEMENT CONDITION
            if(rear == front) { 
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }
        public static int peak() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {

    }
}