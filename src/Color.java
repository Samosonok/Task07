
/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public enum Color {

    RED("#FF0000"),
    GREEN("#008000"),
    BLUE("#0000FF"),
    WHITE("#FFFFFF"),
    BLACK("#000000");

    private final String hex;
    private final int r;
    private final int g;
    private final int b;

    Color(String hex) {
        this.hex = hex;
        r = Integer.valueOf(hex.substring(1, 3), 16);
        g = Integer.valueOf(hex.substring(3, 5), 16);
        b = Integer.valueOf(hex.substring(5, 7), 16);
    }

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        hex = String.format("#%02X%02X%02X", r, g, b);
    }

    public static void main(String[] args) {
        System.out.println("Hex:" +
                "\nRED " + RED.hex +
                "\nGREEN " + GREEN.hex +
                "\nBLUE " + BLUE.hex +
                "\nWHITE " + WHITE.hex +
                "\nBLACK " + BLACK.hex);
        System.out.println("\nRGB:" +
                "\nRED (" + RED.r + "," + RED.g + "," + RED.b + ")" +
                "\nGREEN (" + GREEN.r + "," + GREEN.g + "," + GREEN.b + ")" +
                "\nBLUE (" + BLUE.r + "," + BLUE.g + "," + BLUE.b + ")" +
                "\nWHITE (" + WHITE.r + "," + WHITE.g + "," + WHITE.b + ")" +
                "\nBLACK (" + BLACK.r + "," + BLACK.g + "," + BLACK.b + ")");
    }
}