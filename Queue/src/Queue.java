import java.util.Scanner;

public class Queue {

    private static Queue queue = null;
    private int arr[];
    private int front = -1;
    private int rear = -1;
    private int size;
    private int x;

    private Queue(){

    }
    public static Queue getInstance(){
        if (queue == null){
            queue = new Queue();
            return queue;
        }
        else {
            System.out.println("Object is already created");
            return queue;
        }

    }
    public void defineSizeOfQueue() {
        System.out.println("Enter the size of Queue...");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
    }

    public boolean isFull() {
        if (rear == size - 1) {
            System.out.println("Queue is FUll");
            return true;
        }
        //System.out.println("Queue is not full");
        return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is Empty...");
            return true;
        }
        //System.out.println("Queue is not empty");
        return false;

    }

    public void enqueue(int x) {
        if (front == -1 && rear == -1) {
            arr[++front] = x;
            ++rear;
            System.out.println("Element added to Queue : " + x);
        } else if (!isFull()) {
            arr[++rear] = x;
            System.out.println("Element added to Queue : " + x);

        }
    }

    public void dequeue() {
        System.out.println("Element removed from Queue : "+arr[front]);
        if (!isEmpty()) {

            for (int i = front; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            --rear;


        }
    }

    public void peek() {
        System.out.println("Element at the front of queue is : " + arr[front]);
    }
}
