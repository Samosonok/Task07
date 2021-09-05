package stack;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Stack {

    private final int[] stack;
    private final int size;
    private int element;
    private int top;
    private int bottom;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
        bottom = 0;
        element = 0;
    }

    public void push(int value) {
        if (top == size - 1) {
            top = -1;
        }
        stack[++top] = value;
        element++;
    }

    public int pop() {
        int first = stack[bottom++];
        if (bottom == size) {
            bottom = 0;
        }
        element--;
        return first;
    }

    public boolean isEmpty() {
        return (element == 0);
    }
}