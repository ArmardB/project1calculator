package bellamy.armard.project1calculator;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Memory {

    private double rememberMe;

    Calculator calculator = new Calculator();
    private double memory;

    public void setMemory(){
        this.rememberMe = calculator.getCurrentState();
    }

    public double resetMemory(){
        this.rememberMe = 0.0;
        return rememberMe;
    }

    public double recallMemory(){
        return rememberMe;
    }
}
