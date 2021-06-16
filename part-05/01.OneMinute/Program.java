public class Program {
    public static void main(String[] args) {

        Timer clock = new Timer();

        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }

}
