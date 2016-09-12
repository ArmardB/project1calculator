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
        System.out.println("####################################");
        System.out.println(" Welcome to the ZipCode Calculator");
        System.out.println("####################################");
        System.out.println();
    }

    public void clearDisplay(){
        calculator.resetState();
    }

    public void displayMainOptionsMenu(){
        System.out.println("*****************************************");
        System.out.println("Enter the number for the desired option: ");
        System.out.println("[1] Basic Math Operators: ");
        System.out.println("[2] Trigonometry Functions ");
        System.out.println("[3] Logarithmic Functions");
        System.out.println("[4] Memory Options");
        System.out.println("[5] Clear");
        System.out.println("[6] Settings");
        System.out.println("*****************************************");
        System.out.println();
        userMainMenuChoice();

    }

    public void userMainMenuChoice(){

        int userChoice = scanner.nextInt();
        switch(userChoice){
            case 1: displayBasicMathOperatorsMenu(); break;
            case 2: displayTrigFunctionsMenu(); break;
            case 3: displayLogFunctionsMenu(); break;
            case 4: displayMemoryOptions(); break;
            case 5: calculator.resetState(); break;
            case 6: displayCalculatorSettingsMenu(); break;
            default:
                System.out.println("Invalid selection, please choose again.");
        }
    }

    public void displayBasicMathOperatorsMenu(){
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

    }

    public void displayLogFunctionsMenu(){

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
                System.out.println("Memory Set");
                memory.setMemory(); break;
            case 2:
                System.out.println("Memory Value: " + memory.recallMemory());
                break;
            case 3:
                System.out.println("Memory Reset");
                memory.resetMemory(); break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println(calculator.getCurrentState());

    }

    public void displayCalculatorSettingsMenu(){

    }

    public void chooseBasicMathOperator(){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("*****************************");
        System.out.print("Enter first value: ");
        double value1= scanner.nextDouble();
        System.out.print("Enter second value: ");
        double value2 = scanner.nextDouble();

        switch(userInput){
            case 1:
                System.out.println(value1 + " + " + value2 + " = " + operator.addOperator(value1, value2));
                break;
            case 2:
                System.out.println(value1 + " - " + value2 + " = " + operator.subtractOperator(value1, value2));
                break;
            case 3:
                System.out.println(value1 + " * " + value2 + " = " + operator.multiplicationOperator(value1, value2));
                break;
            case 4:
                System.out.println(value1 + " / " + value2 + " = " + operator.divisionOperator(value1, value2));
                break;
            case 5:
                System.out.println(value1 + "^" + value2 + " = " + operator.exponentOperator(value1, value2));
                break;
            case 6:
                System.out.println(value1 + " ^2" + " = " + operator.squaredOperator(value1));
                break;
            case 7:
                System.out.println(value1 + " + " + value2 + " = " + operator.squareRootOperator(value1));
                break;
        }
    }

}
