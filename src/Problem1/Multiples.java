package Problem1;

/**
 * Created by Joshua on 2017-03-09.
 */
public class Multiples {
    private static int Multiple(int inputNum) {
        int result = 0;

        for(int i = 1; i < inputNum; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Multiple(1000));
    }
}
