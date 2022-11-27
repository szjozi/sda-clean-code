package solid.aSingleResponsibilityPrincilpe.solution;

public class Calculator {
    
    private final TextScanner textScanner;

    public Calculator(TextScanner textScanner) {
        this.textScanner = textScanner;
    }

    public double calculateSum() {
        double numb1 = textScanner.getNumber();
        double numb2 = textScanner.getNumber();
        double sum = numb1 + numb2;

        System.out.println("Sum: " + sum);
        return sum;
    }
}