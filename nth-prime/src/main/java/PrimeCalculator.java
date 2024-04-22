class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1)
            throw new IllegalArgumentException();
        int primeCountSoFar = 0;
        int number = 2;
        while (primeCountSoFar < nth) {
            if (isPrime(number)) {
                primeCountSoFar++;
            }
            number++;
        }
        return --number;
    }

    boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
