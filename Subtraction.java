import java.util.Scanner;

public class Subtraction {
    private int firstNumber;
    private int secondNumber;

    public Subtraction(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        Subtraction subtraction = new Subtraction(firstNumber, secondNumber);
        int result = subtraction.subtract();
        System.out.println("The difference is: " + result);

        scanner.close();
    }
}
