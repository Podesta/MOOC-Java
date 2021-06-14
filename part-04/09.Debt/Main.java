public class Main {

    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.01);

        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 20;
        for (int i = 0; i < years; ++i) {
            mortgage.waitOneYear();
        }

        mortgage.printBalance();
    }

}
