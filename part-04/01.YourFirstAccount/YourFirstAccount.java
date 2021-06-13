public class YourFirstAccount {

    public static void main(String[] args) {
        Account peterAcc = new Account("Peter's account", 100);
        peterAcc.deposit(20);
        System.out.println(peterAcc);
    }

}
