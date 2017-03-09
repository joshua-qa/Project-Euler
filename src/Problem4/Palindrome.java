package Problem4;

/**
 * Created by Joshua on 2017-03-10.
 */
public class Palindrome {
    public static void main(String[] args) {
        int result = 0;
        StringBuilder current = new StringBuilder();
        String current2;

        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                current2 = String.valueOf(i*j);
                current.append(String.valueOf(i*j)).reverse();
                if(current2.equals(current.toString()) && result < Integer.parseInt(current2)) {
                    result = Integer.parseInt(current.toString());
                }
                current.delete(0,current.length());
            }
        }

        System.out.println(result);
    }
}
