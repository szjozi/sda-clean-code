package solid.aSingleResponsibilityPrincilpe.violation;

import java.util.Scanner;

public class Calculator {

    public void getNumbersAndCalculateSum() {
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        int sum = numb1 + numb2;
        System.out.println(sum);
    }
}