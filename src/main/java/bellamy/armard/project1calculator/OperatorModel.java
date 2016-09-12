package bellamy.armard.project1calculator;

/**
 * Created by armardbellamy on 9/10/16.
 */
public class OperatorModel {

    private double calculatorState;

    public OperatorModel(){
        this.calculatorState = 0.0;
    }

    public OperatorModel(double number){
        this.calculatorState = number;
    }



    public double getCalculatorState(){
        return this.calculatorState;
    }

    public void addOperator(double number1){
        calculatorState += number1;
    }

    public double addOperator(double number1, double number2){
        calculatorState = number1 + number2;
        return calculatorState;
    }

    public void subtractOperator(double number1){
        calculatorState -= number1;
    }

    public double subtractOperator(double number1, double number2){
        calculatorState = number1 - number2;
        return  calculatorState;
    }

    public void multiplicationOperator(double number){
        calculatorState *= number;
    }

    public double multiplicationOperator(double number1, double number2){
        calculatorState = number1 * number2;
        return calculatorState;
    }

    public void divisionOperator(double number){
        calculatorState /= number ;
    }

    public double divisionOperator(double number1, double number2){
        calculatorState = number1 / number2;
        return calculatorState;
    }

    public double exponentOperator (double base, double exponent){
        calculatorState = Math.pow(base, exponent);
        return calculatorState;
    }

    public double squaredOperator(double number){
        calculatorState = number * number;
        return  calculatorState;
    }

    public double squareRootOperator(double number){
        calculatorState = Math.sqrt(number);
        return  calculatorState;
    }

    public void sineOperator(double number){
        calculatorState = Math.sin(number);
    }

    public void cosineOperator(double number){
        calculatorState = Math.cos(number);
    }

    public void tangentOperator(double number){
        calculatorState = Math.tan(number);
    }

    public void inverseSineOperator(double number){
        calculatorState = 1 / Math.sin(number);
    }

    public void inverseCosineOperator(double number){
        calculatorState = 1 / Math.cos(number);
    }

    public void inverseTangentOperator(double number){
        calculatorState = 1 / Math.tan(number);
    }

    public void logOperator(double number){
        calculatorState = Math.log(number);
    }

    public void inverseLogOperator(double number){
        calculatorState = Math.log10(number);
    }

    public void naturalLogOperator(double number){
        calculatorState = Math.log1p(number);
    }

//    public void inverseNaturalLog(double number){
//        // Figure this out!!!!!!
//    }

    public double factorial(double number){
        if (number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }

    public void absoluteValueOperator(double number){
        calculatorState = Math.abs(number);
    }

    public void cubeRootOperator(double number){
        calculatorState = Math.cbrt(number);
    }
}
