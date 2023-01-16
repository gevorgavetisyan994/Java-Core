package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        //myCalculator.plus(5.6, 6.9);
        double plus;
        plus = myCalculator.plus(5, 6.9);
        System.out.println(plus);
        //myCalculator.minus(10, 8.1);
        double minus;
        minus = myCalculator.minus(19, 8);
        System.out.println(minus);
        // myCalculator.divide(22.2, 11.1);
        double divide;
        divide = myCalculator.divide(150,0);
        System.out.println(divide);
        // myCalculator.multiply(112, 6);
        double multiply;
        multiply = myCalculator.multiply(690,69);
        System.out.println(multiply);
    }
}
