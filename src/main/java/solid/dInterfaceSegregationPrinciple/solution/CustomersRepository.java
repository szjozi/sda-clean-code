package solid.dInterfaceSegregationPrinciple.solution;

public class CustomersRepository implements CreatableRepository, ReadableRepository {
    
    @Override
    public void create() {
        // save customer in DB
    }

    @Override
    public void read() {
        // read customer data from DB
    }
}
