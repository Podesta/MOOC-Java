public class AdvancedAstrology {

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }

    public static void printSpaces(int length) {
        for (int i = 0; i < length; ++i) {
            System.out.print(" ");
        }
    }

    public static void printStars(int length) {
        for (int i = 0; i < length; ++i) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; ++i) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // Print top of tree. To the tip, sides is 0, and after it increase by 2
        int sides = 0;
        for (int i = 1; i <= height; ++i) {
            printSpaces(height - i);
            printStars(i + sides);
            ++sides;
        }

        // Print trunk
        for (int i = 0; i < 2; ++i) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

}
