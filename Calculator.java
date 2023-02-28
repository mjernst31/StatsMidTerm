/**
 * @author Matthew Ernst
 * @version 1.1
 */

import java.math.*;
public class Calculator {

    /**
     * Calculates permutations by using the factorial function that is defined within the program
     * @param n An integer that represents n
     * @param r An integer that represents r
     * @return Returns the permutation of n and r as a BigInteger
     */
    public static BigInteger Permutation(int n, int r) {
        BigInteger numerator = Calculator.Factorial(n);
        BigInteger denominator = Calculator.Factorial(n - r);

        return numerator.divide(denominator);
    }

    /**
     * Calculates the combination using the factorial function that is defined within this program
     * @param n An integer that represents n
     * @param r An integer that represents r
     * @return Returns the combination of n and r as a BigInteger
     */
    public static BigInteger Combination(int n, int r) {
        BigInteger numerator = Calculator.Factorial(n);
        BigInteger denominator = Calculator.Factorial(n - r).multiply(Calculator.Factorial(r));

        return numerator.divide(denominator);
    }

    /**
     * Calculates the factorial of f
     * @param f An integer that represents what we are taking the factorial of.
     * @return Returns the factorial of f as a BigInteger
     */
    public static BigInteger Factorial(int f) {
        BigInteger totalF = BigInteger.valueOf(1);

        for (int i = f; i > 1; i--)
            totalF = totalF.multiply(BigInteger.valueOf(i));

        return totalF;
    }

    /**
     * Calculates the Binomial Distribution
     * @param n An integer that represents the sample size
     * @param x An integer that represents the instance we are trying to find the chance of
     * @param p A double that represents the chance of succeeding
     * @param q A double that represents the chance of failing (also can be represented by 1-p)
     * @return Returns the binomial distribution as a double.
     */
    //Returns the Binomial of n.
    public static double Binomial(int n, int x, double p, double q) {
        return Calculator.Combination(n, x).doubleValue() * Math.pow(p, x) * Math.pow(q, n - x);
    }

    /**
     * Calculates teh Binomial Distribution with a sum of n and until n-x
     * @param n An integer that represents the last instance we are trying to find the sample size of.
     * @param x An integer that represents the first instance we are trying to find the chance of
     * @param p A double that represents the chance of succeeding
     * @param q A double that represents the chance of failing (also can be represented by 1-p)
     * @return Returns the Binomial Distribution of n-x as a double.
     */
    public static double BinomialAtleast(int n, int x, double p, double q) {
        double sum = 0;
        for (int i = x; i <= n; i++) {
            sum = sum + (Calculator.Combination(n, i).doubleValue() * Math.pow(p, i) * Math.pow(q, n - i));
        }
        return sum;
    }

    /**
     * Calculates the geometric distribution
     * @param p A double that represents the chance of succeeding
     * @param q A double that represents the chance of failing
     * @param n An integer that represents the instance we are trying to find the chance of
     * @return Returns the geometric distribution as a double
     */
    public static double geometric(double p, double q, int n){
        return (Math.pow(q, n-1)*p);
    }
}

