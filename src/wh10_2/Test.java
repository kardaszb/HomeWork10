package wh10_2;

public class Test {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount(null, 123);
        } catch (NullPointerException ex) {
            System.err.println(ex.getMessage());
        }

        BankAccount bankAccount = new BankAccount("Wiktor", 10000);

        try {
            bankAccount.withdraw(11000);
        } catch (NotEnoughtMonyException | TransactionLImitException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            bankAccount.withdraw(4000);
        } catch (NotEnoughtMonyException | TransactionLImitException ex) {
            System.err.println(ex.getMessage());
        }


    }
}
