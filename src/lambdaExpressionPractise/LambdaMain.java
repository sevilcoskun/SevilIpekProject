<<<<<<< HEAD
/*
* Lambda expression starts to be used after Java 8
* It is an example of Functional Programming
* We can get advantages of
*       + clean code,
*       + parallel coding,
*       + flexibility and reusable API
*  There are different examples of where can we use the lambda expressions such as;
*  1- Interface class --> if we have only one abstract function, we can use that function as lambda expression
*  2- Lambda expressions in iterative/traverse jobs like foreach
*  3- Stream functions --> mapReduce(HADOOP / SP, map(), filter(), reduce().
*       Stream pipeline:
*           1. source(collection, list, etc)
*           2. process job(map/filter)
*           3. result process(reduce)
* */

=======
>>>>>>> master
package lambdaExpressionPractise;

import com.sun.org.apache.xpath.internal.operations.Mult;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

public class LambdaMain {
    public static void main(String args[]){

        //1 -Interface usage
=======
public class LambdaMain {
    public static void main(String args[]){

>>>>>>> master
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

<<<<<<< HEAD
        // 2-Lambda expressions in iterative jobs
        //without parameter lambda function
        List<Integer> intseq = Arrays.asList(1,2,3,4,5);
        intseq.forEach(x -> {
            x += 2;
            System.out.println("without parameter integer item: " + x);
        });

        //with parameter lambda function
        List<String> charseq = Arrays.asList("name", "surname", "age", "nationality");
        charseq.forEach( (String s) -> {
            char c = s.charAt(0);
            System.out.println("with parameter first char of each string: " + c);
        });

        // 3-Streams
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        int sum = l.stream().map(x -> x * x).reduce((x,y) -> x + y).get();
        System.out.println("Result: " + sum);



=======
>>>>>>> master
    }
}
