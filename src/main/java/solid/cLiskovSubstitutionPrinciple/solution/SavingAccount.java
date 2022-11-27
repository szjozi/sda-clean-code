package solid.cLiskovSubstitutionPrinciple.solution;

import java.math.BigDecimal;
import java.util.Optional;

public class SavingAccount extends BankAccount {

    public SavingAccount(BigDecimal deposit) {
        super(deposit);
    }

    @Override
    public Optional<BigDecimal> withdrawMoney(BigDecimal amount) {
        return Optional.empty();
    }
}