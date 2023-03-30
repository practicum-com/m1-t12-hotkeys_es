import java.util.Scanner;

public class PetrolCalculatorClasses {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of actions => ");
        int iterationsCount = scanner.nextInt();
        for (int counter = 0; counter < iterationsCount; counter++) {
            System.out.print("Enter fuel type: 1 - 92 octane gas, 2 - 95 octane gas => ");
            int petrolType = scanner.nextInt();
            System.out.print("Enter the number of volume => ");
            double volume = scanner.nextDouble();
            if (petrolType == 1) {
                double price = new Petrol1Calculator().calculate(volume);
                System.out.println("The price of " + volume + " volume of the 92 octane gas is $" + price + );
            } else if (petrolType == 2) {
                double price = new Petrol2Calculator().calculate(volume);
                System.out.println("The price of " + volume + " volume of the 95 octane gas is $" + price + );
            }
        }
    }

    public static void main(String[] args) {
		System.out.println("Entered arguments:" + args);
        new PetrolCalculatorClasses().calculate();
    }
}
