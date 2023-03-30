import java.util.Scanner;

public class PetrolCalculatorClasses {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de acciones => ");
        int iterationsCount = scanner.nextInt();
        for (int counter = 0; counter < iterationsCount; counter++) {
            System.out.print("Ingresa el tipo de combustible: 1 — gasolina de 92 octanos, 2 — gasolina de 95 => ");
            int petrolType = scanner.nextInt();
            System.out.print("Ingresa el número de volumen => ");
            double volume = scanner.nextDouble();
            if (petrolType == 1) {
                double price = new Petrol1Calculator().calculate(volume);
                System.out.println("El costo de " + volume + " litros de gasolina de 92 octanos es $" + price);
            } else if (petrolType == 2) {
                double price = new Petrol2Calculator().calculate(volume);
                System.out.println("El costo de " + volume + " litros de gasolina de 95 octanos es $" + price);
            }
        }
    }

    public static void main(String[] args) {
		System.out.println("Entered arguments:" + args);
        new PetrolCalculatorClasses().calculate();
    }
}
