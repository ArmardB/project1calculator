package bellamy.armard.project1calculator;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Calculator {

    private double currentState;

    // Sets default state
    public Calculator(){
        this.currentState = 0.0;
    }

    // Sets state with value
    public Calculator(double number){
        this.currentState = number;
    }

    // Set state to zero
    public void resetState(){
        currentState = 0.0;
        System.out.println(getCurrentState());

    }
    // Get current state
    public double getCurrentState(){
        return this.currentState;
    }




}
