import java.io.*;

public class Main {

    public static void main(String[] args) {
        printGreeting("Tom");
        calculate(3, 7, "sum");
        calculate(3,7, "difference");
        calculate(3,7, "product");
        calculate(3,7, "quotient");

        calculatePerimetr(3,7);
        calculatePerimeter(4);
        calculatePerimeter(-2,2);


    }
    public static void printGreeting(String name) {
        System.out.println("Hallo " + name);
    }
    public static void calculate(int numOne, int numTwo, String operation) {
        if (operation.equals("sum")) {
            float ergebnis = (numOne + numTwo);
            System.out.println("Eregibt" + ergebnis);
        }
        if (operation.equals("difference")) {
            float ergebnis = (numOne - numTwo);
            System.out.println("Eregibt" + ergebnis);
        }
        if (operation.equals("product")) {
            float ergebnis = (numOne * numTwo);
            System.out.println("Eregibt" + ergebnis);
        }
        if (operation.equals("quotient")) {
            float ergebnis = (numOne / numTwo);
            System.out.println("Eregibt" + ergebnis);
        }
        else {
            System.out.println("Unbekannte Operation");
        }


    }

    public static double calculatePerimeter(double sideLength){
        if (sideLength < 0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
        }
        double perimeter = 2 * sideLength;
        System.out.println("Der Umfang von einem Quadrat mit den Kantenlängen" + sideLength + "beträgt" + perimeter);
    }
    public static double calculatePerimeter(double sideLength, double width){
        if (sideLength < 0 || width < 0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
        }
        double perimeter = 2 * (sideLength + width);
        System.out.println("Der Umfang von einem Rechteck mit den Kantenlängen" + sideLength + "und" + width + "beträgt" + perimeter);

    }
}
