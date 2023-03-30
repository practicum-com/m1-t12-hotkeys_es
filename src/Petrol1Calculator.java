public class Petrol1Calculator {
    double prc = 42.74;
    double tax = 0.13;
    double fullPrice = prc * (1 + tax);

    public double calculate(double volume) {
        return volume * fullPrice;
    }
}
