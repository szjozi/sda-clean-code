package solid.dInterfaceSegregationPrinciple.solution;

public class SuppliersRepository implements CreatableRepository, ReadableRepository, UpdatableRepository {
    
    @Override
    public void create() {
        // save supplier in DB
    }

    @Override
    public void read() {
        // read supplier data from DB
    }

    @Override
    public void update() {
        // updates supplier data in DB
    }
}