package Problem6;

/**
 * Created by Joshua on 2017-03-13.
 */
public class SumSquare {
    public static void main(String[] args) {
        int squareSum = 0;
        int sumSquare = 0;

        for (int i = 1; i <= 100; i++) {
            squareSum += i*i;
            sumSquare += i;
        }

        sumSquare = (int)Math.pow(sumSquare, 2);

        System.out.println(sumSquare - squareSum);
    }
}
