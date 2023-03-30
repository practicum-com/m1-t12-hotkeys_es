public class Petrol2Calculator {
    double prc = 46.35;
    double tax = 0.14;
    double fullPrice = prc * (1 + tax);

    public double calculate(double volume) {
        return volume * fullPrice;
    }
}
