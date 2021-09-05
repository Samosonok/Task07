
/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Recursion {

    public static void main(String[] args) {
        String[] transport = {"Tram", "Car", "Bus", "Train", "Airplane"};
        printArray(transport, transport.length - 1);
    }

    public static void printArray(String[] transport, int count) {
        if (count != -1) {
            printArray(transport, count - 1);
            System.out.println(transport[count]);
        }
    }
}