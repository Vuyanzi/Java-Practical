public class PrimeNumberSum {
    // Method to check if the number given is a prime number
    static boolean isPrime(int numberToCheck)
    {
        if(numberToCheck == 1) {
            return false;
        }
        for (int i = 2; i*i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Method to iterate from 1 to j
    // For each iteration if the number is prime, sum its value
    static int primeNumbersSum(int j)
    {
        int sum = 0;
        for (int i = j; i >= 1; i--) {

            // Check for prime
            boolean prime = isPrime(i);
            if (prime) {

                // Sum the prime number
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = primeNumbersSum(50);
        System.out.println("The sum of prime numbers in 50 is " + sum);
    }

}
