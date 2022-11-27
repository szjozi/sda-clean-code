package solid.eDependencyInversionPrinciple.violation;

public class OlxCarsController {

    private OlxService olxService;

    public void listCars() {
        olxService.listCars();
    }
}