package LAB10;
import java.util.Random;

class CustomisedException extends Exception {
    private int iterationCount;

    public CustomisedException(int iterationCount) {
        this.iterationCount = iterationCount;
    }

    public int getIterationCount() {
        return iterationCount;
    }
}

 class ExceptionHandling {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (CustomisedException e) {
            System.out.println("Exception occurred at iteration: " + e.getIterationCount());
        }
    }

    public static void performOperation() throws CustomisedException {
        Random random = new Random();
        int iterations = 10;

        for (int i = 1; i <= iterations; i++) {
            try {
                // Perform some operation
                if (random.nextInt(10) == 0) {
                    throw new ArithmeticException("ArithmeticException occurred at iteration: " + i);
                }
            } catch (ArithmeticException e) {
                throw new CustomisedException(i);
            }
        }
    }
}
