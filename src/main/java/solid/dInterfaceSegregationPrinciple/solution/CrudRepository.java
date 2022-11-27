package solid.dInterfaceSegregationPrinciple.solution;

public interface CrudRepository extends CreatableRepository, ReadableRepository,
        UpdatableRepository, RemovableRepository{
}