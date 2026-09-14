package lab1;

public class Reduce {
    public static void main() {
        stepsNeeded( );
    }

    private static void stepsNeeded(int n) {
        int steps = 0;
        while (n != 0){
            if (n % 2 == 0) {
                n = n / 2;
                steps++;
            } else {
                n = n - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }

    static void stepsNeeded() {
        stepsNeeded(100);
    }
}
