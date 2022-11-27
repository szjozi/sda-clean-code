package solid.cLiskovSubstitutionPrinciple.violation;

import java.math.BigDecimal;

public class SavingAccount extends BankAccount {
    
    public SavingAccount(BigDecimal deposit) {
        super(deposit);
    }

    @Override
    public BigDecimal withdrawMoney(BigDecimal amount) {
        throw new UnsupportedOperationException("Saving account does not support money withdraw!");
    }
}