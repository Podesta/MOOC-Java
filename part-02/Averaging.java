public class Averaging {

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double average(int n1, int n2, int n3, int n4) {
        return sum(n1, n2, n3, n4) / 4.0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}

