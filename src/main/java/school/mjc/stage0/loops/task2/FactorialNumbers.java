package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
        } else {
            int counter = 1;
            int fact = 1;

            System.out.println(1);
            while (counter <= printToInclusive) {
                fact *= counter;
                System.out.println(fact);
                counter++;
            }
        }

    }
}
