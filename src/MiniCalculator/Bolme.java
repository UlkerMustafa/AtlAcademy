package MiniCalculator;

public class Bolme {
    public double qismet(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Sıfıra bölmə mümkün deyil!");
        }
        return a / b;
    }
}
