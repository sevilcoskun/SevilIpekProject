package lambdaExpressionPractise;

import javax.swing.*;

public class Multiplication implements ICalculator {
    private int x, y;
    private int result = 0;

    public Multiplication(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void printResult() {
        setResult(this.x * this.y);
        System.out.println("Multiplication result is: " + this.getResult());
    }

    /*@Override
    public int getResult() {
        return this.result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }*/
}
