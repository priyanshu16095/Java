package Queue;
public class queue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }
        public static void add(int value) {
            if(rear == size-1) {
                System.out.println("Full Queue!");
                return;
            } 
            rear++;
            arr[rear] = value;
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peak() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.add(120);
        queue.add(10);
        queue.add(7);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()) {
            System.out.print(queue.peak() + " ");
            queue.remove();
        }
        
    }
}