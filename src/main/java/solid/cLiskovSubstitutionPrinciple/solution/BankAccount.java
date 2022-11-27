package solid.cLiskovSubstitutionPrinciple.solution;

import java.math.BigDecimal;
import java.util.Optional;

public class BankAccount {

    protected BigDecimal funds;

    public BankAccount(BigDecimal deposit) {
        this.funds = deposit;
    }

    public void depositMoney(BigDecimal amount) {
        funds = funds.add(amount);
    }

    public Optional<BigDecimal> withdrawMoney(BigDecimal amount) {
        if (funds.compareTo(amount) >= 0) {
            funds =  funds.subtract(amount);
            return Optional.of(amount);
        } else {
            throw new IllegalArgumentException("Cannot withdraw money, account has insufficient funds!");
        }
    }
}