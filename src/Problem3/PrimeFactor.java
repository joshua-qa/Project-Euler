package Problem3;

/**
 * Created by Joshua on 2017-03-10.
 */
public class PrimeFactor {
    private static long prime(Long inputNum) {
        long result = 0;
        long current = inputNum;
        long half = inputNum / 2;

        for(int i = 2; i < current; i++) {
            if (i % 2 == 0) {
                continue;
            }
            while(current % i == 0) {
                current = current / i;
                if (current % i != 0) {
                    result = current;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long inputNum = 600851475143L;

        System.out.println(prime(inputNum));
    }
}
