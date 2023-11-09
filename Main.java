import classes.*;

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
        RectanglePerimeter rectanglePerimeter;

        CircleArea circleArea=new CircleArea();
        CirlclePerimeter cirlclePerimeter= new CirlclePerimeter();





        int userReq;
        Scanner scanner=new Scanner(System.in);
    try {

        System.out.println("welcome to  developers zone !!!!".toUpperCase());
        System.out.println("1. ADDITION");
        System.out.println("2 . MULTIPLICATION");

        System.out.println("3. AREA OF A TRIANGLE");

        System.out.println("4. AREA OF A CIRCLE");
        System.out.println("5. PERIMETER OF A CIRCLE");
        System.out.println("6. PERIMETER OF A Rectangle");
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
            case 3:
                System.out.print("Enter the base : ");

                 firstNumber = scanner.nextInt();

                System.out.print("Enter the height: ");
                secondNumber = scanner.nextInt();
                double res=    trianglesArea1.calculateTriangleArea(firstNumber,secondNumber);
                System.out.println("thanks for using our service  your  answer is  : "+res);
                break;
            case 6:
                System.out.print("Enter the Length : ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the Width : ");
                secondNumber = scanner.nextInt();
                rectanglePerimeter = new RectanglePerimeter(firstNumber, secondNumber);
                int   perimeter = rectanglePerimeter.findPerimeter();
                System.out.println("thanks for using our service  your  answer is  : "+perimeter);
                break;
            case 7:
                System.out.print("Enter the first number : ");
                firstNumber = scanner.nextInt();
                System.out.print("Enter the second number: ");
                secondNumber = scanner.nextInt();
                int   res7=subtraction.subtract(firstNumber,secondNumber);
                System.out.println("thanks for using our service  your  answer is  : "+res7);
                break;
            case 4:
                System.out.print("Enter the the radius of the circle : ");
                firstNumber = scanner.nextInt();
                double   res4=circleArea.area(firstNumber);
                System.out.println("thanks for using our service  your  answer is  : "+res4);
            case 5:
                System.out.print("Enter the radius : ");
                firstNumber = scanner.nextInt();
               double res5=cirlclePerimeter.perimeter(firstNumber);
                System.out.println("thanks for using our service  your  answer is  : "+res5);
                break;
        }
    } catch (Exception ex){
        throw new Exception("error occured");
    } finally {
        scanner.close();
    }

    }
}
