package bellamy.armard.project1calculator;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Memory {

    Calculator calculator = new Calculator();
    private double memory;

    public void setMemory(){
        this.memory = calculator.getCurrentState();
    }

    public void resetMemory(){
        this.memory = 0.0;
    }

    public double recallMemory(){
        return memory;
    }
}
