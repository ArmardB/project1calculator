package bellamy.armard.project1calculator;

import java.util.Scanner;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Calculator {

    Scanner scanner = new Scanner(System.in);
    private double currentState;

   // Sets default state
    public Calculator(){
        currentState = 0.0;
    }

    public void setCurrentState() {
        System.out.print("Enter value: ");
        double userInput = scanner.nextDouble();
        currentState = userInput;
    }

    // Set state to zero
    public void resetState(){
        currentState = 0.0;
        System.out.println("State Reset: " + getCurrentState());

    }
    // Get current state
    public double getCurrentState(){
        return currentState;
    }




}
