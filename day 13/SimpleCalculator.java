public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    // Returns the value of firstNumber
    public double getFirstNumber() {
        return firstNumber;
    }

    // Returns the value of secondNumber
    public double getSecondNumber() {
        return secondNumber;
    }

    // Sets the value of firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Sets the value of secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Returns the addition result
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Returns the subtraction result
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Returns the multiplication result
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Returns the division result
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("Addition = " + calculator.getAdditionResult());
        System.out.println("Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());
    }
}