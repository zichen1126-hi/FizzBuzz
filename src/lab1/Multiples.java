package lab1;

class Multiples {
    public static void main() {
        int numberOfMultiples = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0){
                numberOfMultiples++;
            } else if (i % 5 == 0){
                numberOfMultiples++;
            }
        }
        System.out.println(numberOfMultiples);
    }
}
