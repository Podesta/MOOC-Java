public class Smallest {

    public static int smallest(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }

}
