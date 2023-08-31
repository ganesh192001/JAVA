// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Queue Q1 = new Queue();
        Queue Q1 = Queue.getInstance();
        Q1.defineSizeOfQueue();
        Q1.enqueue(1);
        Q1.enqueue(2);
        Q1.enqueue(3);
        Q1.enqueue(4);

        Q1.peek();

        Q1.dequeue();

        Q1.peek();

        Q1.dequeue();

        Q1.peek();

        Q1.dequeue();

        Q1.peek();

        Q1.enqueue(5);

        Q1.dequeue();

        Q1.peek();

        Queue Q2 = Queue.getInstance();

    }
}