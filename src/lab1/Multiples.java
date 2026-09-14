package lab1;

class Multiples {
    public static void main() {
        System.out.println(multiples());
    }

    private static int multiples(int n, int a, int b) {
        int numberOfMultiples = 0;
        for (int i = 1; i <= n; i++){
            if (i % a == 0){
                numberOfMultiples++;
            } else if (i % b == 0){
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }
}
