package lambdaExpressionPractise;

import com.sun.org.apache.xpath.internal.operations.Mult;

public class LambdaMain {
    public static void main(String args[]){

        ICalculator iCalculator = () -> {
            Addition r1 = new Addition(5,3);
            System.out.print("Calculator worked in ");
            r1.printResult();

            Subtraction r2 = new Subtraction(5, 3);
            System.out.print("Calculator worked in ");
            r2.printResult();

            Multiplication r3 = new Multiplication(5, 3);
            System.out.print("Calculator worked in ");
            r3.printResult();

            Division r4 = new Division(5, 3);
            System.out.print("Calculator worked in ");
            r4.printResult();
        };

        iCalculator.printResult();

    }
}
