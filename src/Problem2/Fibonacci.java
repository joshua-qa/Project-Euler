package Problem2;

/**
 * Created by Joshua on 2017-03-09.
 */
public class Fibonacci {
    public static final int MAX_NUM = 4000000;
    public static int[] fiboArray = new int[35];

    private static int Fibo(int inputNum) {
        if(inputNum == 1 || inputNum == 2) {
            return 1;
        } else if(fiboArray[inputNum] != 0) {
            return fiboArray[inputNum];
        } else {
            fiboArray[inputNum] = Fibo(inputNum-2) + Fibo(inputNum-1);
        }
        return fiboArray[inputNum];
    }

    private static int EvenCal(int[] fiboArray, int maxNum) {
        int result = 0;

        for(int i = 0; i < fiboArray.length; i++) {
            if((fiboArray[i] & 1) != 1 && fiboArray[i] < maxNum) {
                result += fiboArray[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Fibo(34);
        System.out.println(EvenCal(fiboArray, MAX_NUM));
    }
}
