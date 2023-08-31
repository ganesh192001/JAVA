import java.util.Scanner;

public class Stack {
    private int arr[];
    private int size;
    private int top = -1;

    private int x;

    public void defineSizeOfStack() {
        System.out.println("Enter the Size of stack");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full cannot push..");
        } else {
            arr[++top] = x;
            System.out.println("Element added..."+x);
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            ;
            int x = arr[top--];
            System.out.println("Element poped..."+ x);
        }
    }

    public void peek(){
        System.out.println("Element at top is : "+arr[top]);
    }

    public void sizeOfStack(){
        System.out.println("Size of stack is : "+(top+1));
    }
}
