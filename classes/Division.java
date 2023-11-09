package classes;

    public class Division {

        //creating a method to carry out division
        public double divide(int firstNumber, int secondNumber) {
            if (secondNumber != 0) {
                return (double) firstNumber / secondNumber;
            }
            else {
                System.err.println("Division by zero is not allowed.");
                return Double.NaN; // Return Not-a-Number(NaN) for division by zero
            }
        }
    }
