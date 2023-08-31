// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack S1 = new Stack();
        S1.defineSizeOfStack();
        S1.push(5);
        S1.push(10);
        S1.push(55);
        S1.peek();
        S1.pop();
        S1.peek();
        S1.sizeOfStack();

        S1.pop();
        S1.sizeOfStack();
    }
}