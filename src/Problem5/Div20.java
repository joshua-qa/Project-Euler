package Problem5;

/**
 * Created by Joshua on 2017-03-12.
 */
public class Div20 {
    public static int[] primeArray = {2,3,5,7,11,13,17,19};
    public static void main(String[] args) {
        int min = 1;

        for(int num : primeArray) {
            min *= num;
        }

        // 16과 18을 위해
        min = min * 2 * 2 * 2 * 3;

        System.out.println(min);
    }
}