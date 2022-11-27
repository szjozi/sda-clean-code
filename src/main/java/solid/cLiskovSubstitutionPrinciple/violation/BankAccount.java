package solid.cLiskovSubstitutionPrinciple.violation;

import java.math.BigDecimal;

public class BankAccount {

    protected BigDecimal funds;

    public BankAccount(BigDecimal deposit) {
        this.funds = deposit;
    }

    public void depositMoney(BigDecimal amount) {
        funds = funds.add(amount);
    }

    public BigDecimal withdrawMoney(BigDecimal amount) {
        if (funds.compareTo(amount) >= 0) {
            funds =  funds.subtract(amount);
            return amount;
        } else {
            throw new IllegalArgumentException("Cannot withdraw money, account has insufficient funds!");
        }
    }
}