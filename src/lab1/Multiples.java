package lab1;

class Multiples {
    public static void main() {
        System.out.println(multiples(1,2,3));
    }

    public static int multiples(int n, int a, int b) {
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

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
