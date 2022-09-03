package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    static boolean isPrime(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public void printPrimeNumbers(int printToInclusive) {
        int counter=2;
        while (counter<=printToInclusive){
            if(isPrime(counter))
                System.out.println(counter);
            counter++;
        }
    }
}
