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

    public double sineOperator(double number){
        calculatorState = Math.sin(number);
        return calculatorState;
    }

    public double cosineOperator(double number){

        calculatorState = Math.cos(number);
        return calculatorState;
    }

    public double tangentOperator(double number){
        calculatorState = Math.tan(number);
        return calculatorState;
    }

    public double inverseSineOperator(double number){
        calculatorState = 1 / Math.sin(number);
        return  calculatorState;
    }

    public double inverseCosineOperator(double number){
        calculatorState = 1 / Math.cos(number);
        return calculatorState;
    }

    public double inverseTangentOperator(double number){
        calculatorState = 1 / Math.tan(number);
        return calculatorState;
    }

    public double logOperator(double number){
        calculatorState = Math.log(number);
        return calculatorState;
    }

    public double inverseLogOperator(double number){
        calculatorState = Math.log10(number);
        return calculatorState;
    }

    public double naturalLogOperator(double number){
        calculatorState = Math.log1p(number);
        return calculatorState;
    }

//    public double inverseNaturalLog(double number){
//        // Figure this out!!!!!!
//    }

    public double factorial(double number){
        if (number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }

    public double absoluteValueOperator(double number){
        calculatorState = Math.abs(number);
        return calculatorState;
    }

    public double cubeRootOperator(double number){
        calculatorState = Math.cbrt(number);
        return calculatorState;
    }
}
