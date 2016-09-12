package bellamy.armard.project1calculator;

import java.util.Scanner;
import java.util.*;

/**
 * Created by armardbellamy on 9/11/16.
 */
public class Display {
    OperatorModel operator = new OperatorModel();
    Calculator calculator = new Calculator();
    Memory memory = new Memory();
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    public void runCalculator(){
        while(isRunning){
            displayMainOptionsMenu();

        }
    }

    public void welcomeMessage(){
        System.out.println();
        System.out.println("####################################");
        System.out.println(" Welcome to the ZipCode Calculator");
        System.out.println("####################################");
        System.out.println();
    }

    public void clearDisplay(){
        calculator.resetState();
    }

    public void displayMainOptionsMenu(){
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("Enter the number for the desired option: ");
        System.out.println("[1] Basic Math Operators: ");
        System.out.println("[2] Trigonometry Functions ");
        System.out.println("[3] Logarithmic Functions");
        System.out.println("[4] Memory Options");
        System.out.println("[5] Change State");
        System.out.println("[6] Clear");
        System.out.println("[7] Settings");
        System.out.println("*****************************************");
        System.out.println();
        userMainMenuChoice();

    }

    public void userMainMenuChoice(){
        System.out.print("Please enter your selection: ");
        int userChoice = scanner.nextInt();
        switch(userChoice){
            case 1: displayBasicMathOperatorsMenu(); break;
            case 2: displayTrigFunctionsMenu(); break;
            case 3: displayLogFunctionsMenu(); break;
            case 4: displayMemoryOptions(); break;
            case 5: calculator.setCurrentState(); break;
            case 6: calculator.resetState(); break;
            case 7: displayCalculatorSettingsMenu(); break;
            default:
                System.out.println("Invalid selection, please choose again.");
        }
    }

    public void displayBasicMathOperatorsMenu(){
        System.out.println();
        System.out.println("Current State: " + calculator.getCurrentState());
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("Enter the number for your desired operation: ");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply ");
        System.out.println("[4] Divide");
        System.out.println("[5] Exponent");
        System.out.println("[6] Square");
        System.out.println("[7] Sqrt");
        chooseBasicMathOperator();
    }

    public void displayTrigFunctionsMenu(){
        System.out.println("*****************************************");
        System.out.println("[1]  Sin()");
        System.out.println("[2]  Cos()");
        System.out.println("[3]  Tan()");
        System.out.println("[4]  Inverse Sin()");
        System.out.println("[5]  Inverse Cos()");
        System.out.println("[6]  Inverse Tan()");
        System.out.println("[7]  Log()");
        System.out.println("[8]  Inverse Log()");
        System.out.println("[9]  Natural Log()");
        System.out.println("[10] Inverse Natural Log()");
        System.out.print("Select the number of your choice: ");
        chooseTrigFunction();
    }

    public void chooseTrigFunction(){
        int userInput = scanner.nextInt();
        System.out.println("*****************************************");
        System.out.print("Enter your value: ");
        double userValue = scanner.nextDouble();

        switch(userInput){
            case 1:
                System.out.println("Sin(" + userValue + ")" + " = " + operator.sineOperator(userValue));
                break;
            case 2:
                System.out.println("Cos(" + userValue + ")" + " = " + operator.cosineOperator(userValue));
                break;
            case 3:
                System.out.println("Tan(" + userValue + ")" + " = " + operator.tangentOperator(userValue));
                break;
            case 4:
                System.out.println("Inverse Sin(" + userValue + ")" + " = " + operator.inverseSineOperator(userValue));
                break;
            case 5:
                System.out.println("Inverse Cos(" + userValue + ")" + " = " + operator.inverseCosineOperator(userValue));
                break;
            case 6:
                System.out.println("Inverse Tan(" + userValue + ")" + " = " + operator.inverseTangentOperator(userValue));
                break;
        }
    }

    public void displayLogFunctionsMenu(){
        System.out.println("*****************************************");
        System.out.println("[1] Log()");
        System.out.println("[2] Inverse Log()");
        System.out.println("[3] Natural Log()");
        System.out.println("[4] Inverse Natural Log()");
        System.out.print("Select the number of your choice: ");
        chooseLogFunction();
    }

    public void chooseLogFunction(){
        int userInput = scanner.nextInt();
        System.out.println("*****************************************");
        double userValue = scanner.nextDouble();
        switch (userInput) {
            case 1:
                System.out.println("Log(" + userValue + ")" + " = " + operator.logOperator(userValue));
                break;
            case 2:
                System.out.println("Inverse Log(" + userValue + ")" + " = " + operator.inverseLogOperator(userValue));
                break;
            case 3:
                System.out.println("Ln(" + userValue + ")" + " = " + operator.naturalLogOperator(userValue));
                break;
            case 4:
                System.out.println("Inverse Ln(" + userValue + ")" + " = " + operator.inverseNaturalLog(userValue));
                break;
        }
    }

    public void displayMemoryOptions(){
        System.out.println("*****************************************");
        System.out.println("[1] Set Memory");
        System.out.println("[2] Recall Memory");
        System.out.println("[3] Reset Memory");
        System.out.print("Select the number of your choice: ");
        chooseMemoryOption();

    }

    public void chooseMemoryOption(){
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                memory.setMemory();
                System.out.println("Memory Set: " + memory.recallMemory());
                break;
            case 2:
                System.out.println("Memory Value: " + memory.recallMemory());
                break;
            case 3:
                System.out.println("Memory Reset: " + memory.resetMemory());
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println(calculator.getCurrentState());

    }

    public void displayCalculatorSettingsMenu(){

    }

    public void chooseBasicMathOperator(){
        System.out.println("*****************************************");
        System.out.print("Please choose your option: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("*****************************");
        System.out.print("Enter value: ");
        double value= scanner.nextDouble();

        switch(userInput){
            case 1:
                System.out.println(calculator.getCurrentState() + " + " + value + " = " + operator.addOperator(value));
                break;
            case 2:
                System.out.println(calculator.getCurrentState() + " - " + value + " = " + operator.subtractOperator(value));
                break;
            case 3:
                System.out.println(calculator.getCurrentState() + " * " + value + " = " + operator.multiplicationOperator(value));
                break;
            case 4:
                System.out.println(calculator.getCurrentState() + " / " + value + " = " + operator.divisionOperator(value));
                break;
            case 5:
                System.out.print("Enter exponent value: ");
                double raisedToThePower = scanner.nextDouble();
                System.out.println(value + "^" + raisedToThePower + " = " + operator.exponentOperator(value, raisedToThePower));
                break;
            case 6:
                System.out.println(value + " ^2" + " = " + operator.squaredOperator(value));
                break;
            case 7:
                System.out.println("Sqrt:" + " + " + value + " = " + operator.squareRootOperator(value));
                break;
        }
    }

}
