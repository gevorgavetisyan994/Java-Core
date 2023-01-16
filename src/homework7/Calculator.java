package homework7;

public class Calculator {
    double plus;
    double minus;
    double divide;
    double multiply;

    double plus(double x, double y) {
        //System.out.println("Plus " + x + " + " + y);
        // System.out.println("Method plus is: " + (x + y));
        return x + y;
    }

    double minus(double x, double y) {
        //System.out.println("Minus " + x + " - " + y);
        // System.out.println("Method minus is: " + (x - y));
        return x - y;
    }

    double divide(double x, double y) {
        // System.out.println("Divide " + x + " / " + y);
        //System.out.println("Method divide is: " + (x / y));
        if (y == 0) {
            System.out.println("Can not divide by zero ");
            return -1;
        } else {
            return x / y;
        }

    }

    double multiply(double x, double y) {
        // System.out.println("Multiply " + x + " * " + y);
        //System.out.println("Method multiply is: " + (x * y));
        return x * y;
    }
}

