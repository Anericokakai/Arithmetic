import classes.Addition;
import classes.Subtraction;
import classes.TrianglesCalc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    TrianglesCalc trianglesArea;

    public Main(TrianglesCalc trianglesArea) {
        this.trianglesArea = trianglesArea;
    }

    public static void main(String[] args) throws Exception {

        TrianglesCalc trianglesArea1=new TrianglesCalc();
        Addition addition=new Addition();
        Subtraction subtraction= new Subtraction();


        int userReq;
        Scanner scanner=new Scanner(System.in);
    try {

        System.out.println("welcome to  developers zone !!!!".toUpperCase());
        System.out.println("1. ADDITION");
        System.out.println("2 . MULTIPLICATION");

        System.out.println("3. AREA OF A TRIANGLE");

        System.out.println("4. AREA OF A CIRCLE");
        System.out.println("5. PERIMETER OF A CIRCLE");
        System.out.println("6. PERIMETER OF A TRIANGLE");
        System.out.println("7.  SUBTRACTION");

        System.out.println("which operation  would you wish to performe : \n".toUpperCase());


        userReq=scanner.nextInt();
        int firstNumber;
        int secondNumber;
        switch (userReq){
            case 1:
                System.out.print("Enter the first number: ");
                 firstNumber = scanner.nextInt();

                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
            int result=    addition.add(firstNumber,secondNumber);
                System.out.println("thanks for using our service  your  anser is  : "+result);

break;
            case 2:
                System.out.print("Enter the base : ");

                 firstNumber = scanner.nextInt();

                System.out.print("Enter the height: ");
                secondNumber = scanner.nextInt();
                double res=    trianglesArea1.calculateTriangleArea(firstNumber,secondNumber);

                System.out.println("thanks for using our service  your  anser is  : "+res);
            case 7:
                System.out.print("Enter the first number : ");

                firstNumber = scanner.nextInt();

                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
              int   res7=subtraction.subtract(firstNumber,secondNumber);
                System.out.println("thanks for using our service  your  anser is  : "+res7);

        }
    } catch (Exception ex){
        throw new Exception("error occured");
    } finally {
        scanner.close();
    }




    }
}
