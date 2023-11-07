import java.util.Scanner;

public class Addition {
    private final int firstNumber;
    private final int secondNumber;

    public Addition(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        Addition addition = new Addition(firstNumber, secondNumber);
        int result = addition.add();
        System.out.println("The sum is: " + result);

        scanner.close();
    }
}
