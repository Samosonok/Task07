package stack;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        newStack.push(100);
        newStack.push(200);
        newStack.push(300);
        newStack.push(400);
        newStack.push(500);

        newStack.push(600);
        newStack.push(700);
        newStack.push(800);

        newStack.pop();
        newStack.pop();
        newStack.pop();

        while (!newStack.isEmpty()) {
            int elem = newStack.pop();
            System.out.println("Element: " + elem);
        }
    }
}