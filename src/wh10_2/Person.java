package wh10_2;

public class Person {
    private String accountName;
    private double ballance;

    public Person(String accountName, double ballance) {
        if(accountName == null){
            throw new NullPointerException("Konto musi posiadac wlasciciela!");
        }
        this.accountName = accountName;
        this.ballance = ballance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }
}
