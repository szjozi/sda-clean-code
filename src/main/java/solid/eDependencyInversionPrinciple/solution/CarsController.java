package solid.eDependencyInversionPrinciple.solution;

public class CarsController {

    private CarService carService;

    public void listCars() {
        carService.listCars();
    }
}