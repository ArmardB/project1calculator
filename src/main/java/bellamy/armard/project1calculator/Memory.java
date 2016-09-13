package bellamy.armard.project1calculator;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Memory {


    private double memory;

    public void setMemory(double state){
        memory = state;
    }

    public void resetMemory(){
        memory = 0.0;
    }

    public double recallMemory(){
        return memory;
    }
}
