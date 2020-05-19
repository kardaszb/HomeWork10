package wh10_2;

public class BankAccount {
    private static final double WITHDRAW_LIMIT = 3000;
    Person person;

    public BankAccount(String accountName, double ballance) {
        this.person = new Person(accountName, ballance);
    }

    public void deposit(double amount) {
        double add = person.getBallance();
        add += amount;
        person.setBallance(add);
    }

    public void withdraw(double amount) throws NotEnoughtMonyException, TransactionLImitException {
        double ballance = person.getBallance();
        if (amount > ballance) {
            throw new NotEnoughtMonyException("Przekroczono limit konta. Aktualnie posiadasz: " + ballance);
            //            throw new IllegalArgumentException("Przekroczono limit konta. Aktualnie posiadasz: " + ballance);
        } else {
            ballance -= amount;
            person.setBallance(ballance);
        }
        if (amount > WITHDRAW_LIMIT){
            throw new TransactionLImitException("Przekroczono jednorazowy limit wyplat. Jednorazowo mozesz wyplacic:" + WITHDRAW_LIMIT );
        }
    }
}
