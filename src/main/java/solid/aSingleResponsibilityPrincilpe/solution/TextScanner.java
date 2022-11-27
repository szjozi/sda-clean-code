package solid.aSingleResponsibilityPrincilpe.solution;

import java.util.Scanner;

public class TextScanner {

    private final Scanner scanner = new Scanner(System.in);

    public double getNumber() {
        System.out.println("Please enter number");
        return scanner.nextDouble();
    }

}