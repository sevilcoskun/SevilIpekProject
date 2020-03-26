package lambdaExpressionPractise;

public class Division implements ICalculator {
    private int x, y;
    private int result = 0;

    public Division(int x, int y) {
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
        if(this.y != 0){
            setResult(this.x / this.y);
        }
        else {
            //throw new Exception("Division by zero!");
            System.out.println("Error! - Division by Zero");
        }
        System.out.println("Division result is: " + this.getResult());
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
