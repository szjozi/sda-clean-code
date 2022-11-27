package solid.dInterfaceSegregationPrinciple.solution;

public class ProductsRepository  implements CrudRepository {
    
    @Override
    public void create() {
        // saves product to DB
    }

    @Override
    public void read() {
        // retrieves product information from DB
    }

    @Override
    public void delete() {
        // delete product from DB
    }

    @Override
    public void update() {
        // update product in DB
    }
}