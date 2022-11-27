package solid.dInterfaceSegregationPrinciple.violation;

public class CustomersRepository implements CrudRepository {
    
    @Override
    public void create() {
        // save customer in DB
    }

    @Override
    public void read() {
        // read customer data from DB
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Customer update not supported");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Customer deletion not supported");
    }
}