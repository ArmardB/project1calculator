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
    Mode mode = new Mode();
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    String trigUnits = "DEGREES";


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

    public void displayMainOptionsMenu(){
        mainDisplay();
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("Enter the number for the desired option: ");
        System.out.println("[1] Basic Math Operators: ");
        System.out.println("[2] Trigonometry Functions ");
        System.out.println("[3] Logarithmic Functions");
        System.out.println("[4] Memory Options");
        System.out.println("[5] Change State");
        System.out.println("[6] Clear");
        System.out.println("[7] Change Mode");
        System.out.println("[8] Exit");
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
            case 5: calculator.userResetState(); break;
            case 6: calculator.resetState(); break;
            case 7: changeModeMenu(); break;
            case 8: exitCalculator(); break;
            default:
                System.out.println("Invalid selection, please choose again.");
        }
    }

    public void mainDisplay(){
        System.out.println("*****************************************");
        System.out.println("Current State: " + mode.displayModeConversions(calculator.getCurrentState()));
        System.out.println("Current Mode: " + mode.getDisplayMode());
        System.out.println("*****************************************");
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
        System.out.println("[8] Factorial");
        chooseBasicMathOperator();
    }

    public void chooseBasicMathOperator(){
        System.out.println("*****************************************");
        System.out.print("Please choose your option: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("*****************************************");
        System.out.print("Enter value: ");
        double value= scanner.nextDouble();

        switch(userInput){
            case 1:
                double addIt = operator.addOperator(calculator.getCurrentState(), value);
                System.out.printf("%.2f + %.2f = %.2f", calculator.getCurrentState(), value, operator.addOperator(calculator.getCurrentState(), value));
                System.out.println();
                calculator.setCurrentState(addIt);
                break;
            case 2:
                double subtractIt = operator.addOperator(calculator.getCurrentState(), value);
                System.out.printf("%.2f - %.2f = %.2f", calculator.getCurrentState(), value, operator.subtractOperator(calculator.getCurrentState(), value));
                System.out.println();
                calculator.setCurrentState(subtractIt);
                break;
            case 3:
                double multiplyNums = operator.addOperator(calculator.getCurrentState(), value);
                System.out.printf("%.2f * %.2f = %.2f", calculator.getCurrentState(), value, operator.multiplicationOperator(calculator.getCurrentState(), value));
                System.out.println();
                calculator.setCurrentState(multiplyNums);
                break;
            case 4:
                double divideNums = operator.addOperator(calculator.getCurrentState(), value);
                System.out.printf("%.2f / %.2f = %.2f", calculator.getCurrentState(), value, operator.divisionOperator(calculator.getCurrentState(), value));
                System.out.println();
                calculator.setCurrentState(divideNums);
                break;
            case 5:
                System.out.print("Enter base value: ");
                double baseValue = scanner.nextDouble();
                System.out.print("Enter exponent value: ");
                double exponentValue = scanner.nextDouble();
                double performedExponentiation = operator.exponentOperator(baseValue, exponentValue);
                System.out.println(baseValue + "^" + exponentValue + " = " + operator.exponentOperator(baseValue, exponentValue));
                System.out.printf("%.2f^%.2f = %.2f", baseValue, exponentValue, performedExponentiation);
                System.out.println();
                calculator.setCurrentState(performedExponentiation);
                break;
            case 6:
                double valueSquared = operator.squaredOperator(value);
                System.out.printf("%.2f^2 = %.2f", value, valueSquared);
                System.out.println();
                calculator.setCurrentState(valueSquared);
                break;
            case 7:
                double squareRoot = operator.squareRootOperator(value);
                System.out.printf("Sqrt: %.2f = %.2f", value, squareRoot);
                System.out.println();
                calculator.setCurrentState(squareRoot);
                break;
            case 8:
                double factorial = operator.factorial(value);
                System.out.printf("Factorial: %.2f", factorial);
                System.out.println();
                calculator.setCurrentState(factorial);
        }
    }

    public void displayTrigFunctionsMenu(){
        System.out.println("*****************************************");
        System.out.println("[0]  Switch Mode");
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

    public void chooseTrigFunction() {
        int userInput = scanner.nextInt();
        System.out.println("*****************************************");
        System.out.print("Enter your value: ");
        double userValue = scanner.nextDouble();

        switch (userInput) {
            case 0:
                break;
            case 1:
                double sine = operator.sineOperator(userValue);
                System.out.printf("Sin(%.2f)", sine);
                System.out.println();
                calculator.setCurrentState(sine);
                break;
            case 2:
                double cosine = operator.cosineOperator(userValue);
                System.out.printf("Cos(%.2f)", cosine);
                System.out.println();
                calculator.setCurrentState(cosine);
                break;
            case 3:
                double tangent = operator.tangentOperator(userValue);
                System.out.printf("Tan(%.2f)", tangent);
                System.out.println();
                calculator.setCurrentState(tangent);
                break;
            case 4:
                double inverseSine = operator.inverseSineOperator(userValue);
                System.out.printf("InvSin(%.2f)", inverseSine);
                System.out.println();
                calculator.setCurrentState(inverseSine);
                break;
            case 5:
                double inverseCos = operator.inverseCosineOperator(userValue);
                System.out.printf("InvCOS(%.2f)", inverseCos);
                System.out.println();
                calculator.setCurrentState(inverseCos);
                break;
            case 6:
                double inverseTan = operator.inverseSineOperator(userValue);
                System.out.printf("InvTan(%.2f)", inverseTan);
                System.out.println();
                calculator.setCurrentState(inverseTan);
                break;
        }
    }

        public double convertTrigUnits(double number){
            if(trigUnits.equals("DEGREES")){
                return Math.toDegrees(number);
            }
            return Math.toRadians(number);
    }

        public void switchTrigUnits(){
            System.out.println("*****************************************");
            System.out.println("[1] DEGREES");
            System.out.println("[2] RADIANS");
            System.out.println("Enter number: ");
            int userInput = scanner.nextInt();

            switch(userInput){
                case 1: if (trigUnits.equals("RADIANS")){
                    trigUnits = "DEGREES";
                } else{
                    System.out.println("Already in DEGREES");
                }
                case 2: if (trigUnits.equals("DEGREES")){
                    trigUnits = "RADIANS";
                }else{
                    System.out.println("Already in RADIANS");
                }
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
                double log = operator.logOperator(userValue);
                System.out.printf("Log(%.2f)", log);
                System.out.println();
                calculator.setCurrentState(log);
                break;
            case 2:
                double inverseLog = operator.inverseLogOperator(userValue);
                System.out.printf("InverseLog(%.2f)", inverseLog);
                System.out.println();
                calculator.setCurrentState(inverseLog);
                break;
            case 3:
                double naturalLog = operator.naturalLogOperator(userValue);
                System.out.printf("Ln(%.2f)", naturalLog);
                System.out.println();
                calculator.setCurrentState(naturalLog);
                break;
            case 4:
                double inverseNaturalLog = operator.inverseNaturalLog(userValue);
                System.out.printf("InvLn(%.2f)", inverseNaturalLog);
                System.out.println();
                calculator.setCurrentState(inverseNaturalLog);
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
                memory.setMemory(calculator.getCurrentState());
                System.out.println("Memory Set: " + memory.recallMemory());
                break;
            case 2:
                System.out.println("Memory Value: " + memory.recallMemory());
                break;
            case 3:
                memory.resetMemory();
                System.out.println("Memory Reset: 0.0");
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println(calculator.getCurrentState());

    }

    public void changeModeMenu(){
        mode.displayModeMenu();

    }

    public void exitCalculator(){
        isRunning = false;
    }

    public void clearDisplay(){
        calculator.resetState();
    }



}
