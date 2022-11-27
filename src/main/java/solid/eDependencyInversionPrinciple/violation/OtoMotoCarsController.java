package solid.eDependencyInversionPrinciple.violation;

public class OtoMotoCarsController {

    private OtoMotoService otoMotoService;

    public void listCars() {
        otoMotoService.listCars();
    }
}