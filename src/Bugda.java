import java.math.BigInteger;

public class Bugda {
    public static void main(String[] args) {
        BigInteger grains = BigInteger.ONE;
        BigInteger totalGrains = BigInteger.ZERO;
        for (int i = 1; i <= 64; i++){
            totalGrains = totalGrains.add(grains);
            grains = grains.multiply(BigInteger.TWO);
        }
        System.out.println("Ümumi buğda sayı: " + totalGrains);
    }
}
