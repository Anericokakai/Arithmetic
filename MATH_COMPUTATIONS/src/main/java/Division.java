public class Division {

    //creating a method to carry out division
    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        }
        else {
            System.err.println("Division by zero is not allowed.");
            return Double.NaN; // Return Not-a-Number(NaN) for division by zero
        }
    }
}

